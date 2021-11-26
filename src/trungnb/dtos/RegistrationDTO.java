/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungnb.dtos;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class RegistrationDTO implements Serializable{

    String registrationID, fullname, email, phone, address, symptoms;
    Integer age, numberOfPet;
    boolean gender;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String registrationID, String fullname, Integer age, boolean gender ,String email, String phone, String address, Integer numberOfPet, String symptoms ) {
        this.registrationID = registrationID;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.symptoms = symptoms;
        this.age = age;
        this.numberOfPet = numberOfPet;
        this.gender = gender;
    }

  

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfPet() {
        return numberOfPet;
    }

    public void setNumberOfPet(Integer numberOfPet) {
        this.numberOfPet = numberOfPet;
    }

    public boolean isGender() {
        if (String.valueOf(gender).equalsIgnoreCase("Male")) {
            return gender = true;
        } else if (String.valueOf(gender).equalsIgnoreCase("Female")) {
            return gender = false;
        }
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
     @Override
    public String toString() {
        return registrationID + "," + fullname + "," + age + "," + gender + "," + email + "," + phone + "," + address + "," + numberOfPet+ "," + symptoms ;
    }

    public String print() {
        return registrationID + "," + fullname + "," + age + "," + change(gender) + "," + email + "," + phone + "," + address + "," + numberOfPet+ "," + symptoms ;

    }

    public String change(boolean gender) {
        String temp = "";
        if (gender) {
            temp = "Male";
        } else {
            temp = "Female";
        }
        return temp;
    }
    
    
}
