package com.example.hotelbackend.modal;

import javax.persistence.*;

@Entity
@Table(name="employeeDetails")

public class HotelEmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String emailId;
    private Long mobileNumber;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HotelEmployeeDetails() {

    }

}
