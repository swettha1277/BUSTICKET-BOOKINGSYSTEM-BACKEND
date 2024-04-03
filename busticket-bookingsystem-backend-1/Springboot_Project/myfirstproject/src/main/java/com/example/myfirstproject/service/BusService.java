package com.example.myfirstproject.service;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstproject.patiententity.BusEntity;
import com.example.myfirstproject.repository.BusRepo;

// import jakarta.persistence.metamodel.ListAttribute;

@Service
public class BusService {

    @Autowired
    BusRepo er;

    public BusEntity create(BusEntity ee){
        return er.save(ee);
    }

    public java.util.List<BusEntity> getalldetails(){
        return er.findAll();
    
    }

    public BusEntity getEmployeeById(int id){
        return er.findById(id).orElse(null);
    } 

    public boolean updateDetails(int id,BusEntity employee)
        {
            if(this.getEmployeeById(id)==null)
            {
                return false;
            }
            try{
                er.save(employee);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }

        public boolean deleteEmployee(int id)
        {
            if(this.getEmployeeById(id) == null)
            {
                return false;
            }
            er.deleteById(id);
            return true;
        }

}