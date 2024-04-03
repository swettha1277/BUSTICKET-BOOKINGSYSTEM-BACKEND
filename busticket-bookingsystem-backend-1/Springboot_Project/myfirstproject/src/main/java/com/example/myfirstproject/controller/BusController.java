package com.example.myfirstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstproject.patiententity.BusEntity;
import com.example.myfirstproject.service.BusService;

@RestController
public class BusController {

    @Autowired
    BusService es;

    @PostMapping("adddata")
public ResponseEntity<BusEntity>add(@RequestBody BusEntity em){
    BusEntity obj=es.create(em);
   return new ResponseEntity<>(obj,HttpStatus.CREATED); 
}
@GetMapping("showdata")
public ResponseEntity <List<BusEntity>>showinfo(){
    return new ResponseEntity<>(es.getalldetails(),HttpStatus.OK);
}
@GetMapping("getdata")
public ResponseEntity <List<BusEntity>>getinfo(){
    return new ResponseEntity<>(es.getalldetails(),HttpStatus.OK);
}

@PutMapping("/api/patient/{bid}")
    public ResponseEntity<BusEntity> putMethodName(@PathVariable("bid") int id, @RequestBody BusEntity employee) {
        if(es.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<Boolean> delete(@PathVariable("employeeId") int id)
    {
        if(es.deleteEmployee(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

}