package com.example.myfirstproject.patiententity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BusEntity {

    @Id
    private int bid;
    private String bname;
    private String password;
    public BusEntity(int bid, String bname, String password) {
        this.bid = bid;
        this.bname = bname;
        this.password = password;
    }
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public BusEntity() {
    }
    
    
    
    

}