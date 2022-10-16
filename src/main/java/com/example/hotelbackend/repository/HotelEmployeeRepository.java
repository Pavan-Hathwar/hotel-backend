package com.example.hotelbackend.repository;

import com.example.hotelbackend.modal.HotelEmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelEmployeeRepository extends JpaRepository<HotelEmployeeDetails,Long> {

    @Query("SELECT h from HotelEmployeeDetails h WHERE h.name=?1")
    HotelEmployeeDetails getByName(String name);

}
