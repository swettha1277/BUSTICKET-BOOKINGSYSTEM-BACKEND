package com.example.myfirstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myfirstproject.patiententity.BusEntity;

public interface BusRepo extends JpaRepository<BusEntity,Integer>{

}