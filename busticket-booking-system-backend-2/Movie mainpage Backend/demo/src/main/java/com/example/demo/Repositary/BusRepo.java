package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Bus;

public interface BusRepo extends JpaRepository<Bus,Integer>{
    
}