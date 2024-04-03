package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {
    @Id
    private int ticketid;
    private String busname;
    
    private double amount;
    private String numberofseats;
    private String confirmbooking;
    public Bus(int ticketid, String busname, double amount, String numberofseats, String confirmbooking) {
        this.ticketid = ticketid;
        this.busname = busname;
        this.amount = amount;
        this.numberofseats = numberofseats;
        this.confirmbooking = confirmbooking;
    }
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public String getBusname() {
        return busname;
    }
    public void setBusname(String busname) {
        this.busname = busname;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getNumberofseats() {
        return numberofseats;
    }
    public void setNumberofseats(String numberofseats) {
        this.numberofseats = numberofseats;
    }
    public String getConfirmbooking() {
        return confirmbooking;
    }
    public void setConfirmbooking(String confirmbooking) {
        this.confirmbooking = confirmbooking;
    }
    public Bus() {
    }
    
   
    
}