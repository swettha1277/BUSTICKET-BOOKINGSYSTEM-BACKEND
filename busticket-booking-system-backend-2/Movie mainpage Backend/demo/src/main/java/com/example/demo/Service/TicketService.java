package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bus;
import com.example.demo.Repositary.BusRepo;
@Service
public class TicketService {
    @Autowired
    BusRepo mr;
    public Bus create (Bus mm)
    {
        return mr.save(mm);
    }
    public List<Bus> getAll()
    {
        return mr.findAll();
    }
    public Bus getMe(int id)
    {
        return mr.findById(id).orElse(null);
    }
    public boolean updateDetails(int id,Bus mm)
        {
            if(this.getMe(id)==null)
            {
                return false;
            }
            try{
                mr.save(mm);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteMedicine(int id)
        {
            if(this.getMe(id) == null)
            {
                return false;
            }
            mr.deleteById(id);
            return true;
        }

}