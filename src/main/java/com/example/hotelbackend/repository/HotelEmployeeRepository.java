package com.example.hotelbackend.repository;

import com.example.hotelbackend.modal.HotelEmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelEmployeeRepository extends JpaRepository<HotelEmployeeDetails,Long> {


}
