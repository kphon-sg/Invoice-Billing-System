/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customerManager;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class customer implements Serializable {
    int id;
    String name;
    String email;
    String phoneNumber;

    public customer(int id,String name, String email, String phoneNumber) {
       this.id=id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
}