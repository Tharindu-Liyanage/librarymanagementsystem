/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author thari
 */
public class Member {
 
  
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String nic;


    public Member(int id, String name, String phoneNumber, String address, String nic) {

  

        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.nic = nic;
    }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getAddress(){
        return address;
    }

    public String getNic(){
        return nic;
    }
    
}

