/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

/**
 *
 * @author Muggi
 */
public class Person {
    
    private String fname;
    private String lName;
    private String phone;
    private int id;
    
    public Person(String fname, String lName, String phone,int id){
        this.fname = fname;
        this.lName = lName;
        this.phone = phone;
        this.id = id;   
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
