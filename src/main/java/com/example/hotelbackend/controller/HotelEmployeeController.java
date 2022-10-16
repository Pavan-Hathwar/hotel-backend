package com.example.hotelbackend.controller;

import com.example.hotelbackend.modal.HotelEmployeeDetails;
import com.example.hotelbackend.modal.SignInData;
import com.example.hotelbackend.repository.HotelEmployeeRepository;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api")
//@Slf4j
public class HotelEmployeeController {

    @Autowired
    private HotelEmployeeRepository hotelEmployeeRepository;

    @GetMapping("/employees")
    public List<HotelEmployeeDetails> getAllEmployees(){
        return hotelEmployeeRepository.findAll();
    }

    @PostMapping("/employees")
    public HotelEmployeeDetails createNewEmployee(@RequestBody HotelEmployeeDetails hotelEmployeeDetails){

        HotelEmployeeDetails temp=hotelEmployeeRepository.getByName(hotelEmployeeDetails.getName());
        if (temp ==null){
            return hotelEmployeeRepository.save(hotelEmployeeDetails);
        }
        return null;
    }

    @PostMapping("/employees/validate")
    public String validateLogin(@RequestBody SignInData signInData){

        HotelEmployeeDetails temp=hotelEmployeeRepository.getByName(signInData.getName());
        if(temp==null){
            return "User Does't Exist";
        }

//        log.info(temp.getPassword());
//        log.info(signInData.getPassword());

        if(temp.getPassword().equals(signInData.getPassword())){
            return "";
        }
        return "NO Match";

    }
}
