package com.example.hotelbackend.modal;

import javax.persistence.*;

@Entity
@Table(name="hotelEmployeeDetails")

public class HotelEmployeeDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long empId;
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String emailId;
    @Column
    private Long mobileNumber;
    @Column
    private String password;

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HotelEmployeeDetails(String name, String emailId, Long mobileNumber, String password) {
        this.name = name;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

//    public long getId() {
//        return empId;
//    }
//
//    public void setId(long id) {
//        this.empId = id;
//    }

    public HotelEmployeeDetails() {

    }

}
