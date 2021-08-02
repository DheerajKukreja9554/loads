package com.loadsapi.loads.controller;

import java.util.List;

import com.loadsapi.loads.entitity.Payload;
import com.loadsapi.loads.loadservices.LoadServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    
    @Autowired
    private LoadServiceImpl loadServiceImpl;

    //method to get full list if loads
    @GetMapping("/load")
    public List<Payload> getloads(){
        return this.loadServiceImpl.getloads();
    }

    //method to get ksinglelist of nodes
    @GetMapping("/load/{loadId}")
    public Payload getload(@PathVariable String loadId){
        return this.loadServiceImpl.getloads(loadId);
    }


    //method to add new payload
    @PostMapping("/load")
    public ResponseEntity<String> addloads(@RequestBody Payload p){
        try {
            this.loadServiceImpl.addloads(p);
            return new ResponseEntity<>("loads details added successfully", HttpStatus.OK);
        
        } catch (Exception e) {
            return new ResponseEntity<>("some error occured",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //method to change a payload
    @PutMapping("/load")
    public ResponseEntity<String> changeloads(@RequestBody Payload p){
        try {
            
            return new ResponseEntity<>("loads details updated successfully",HttpStatus.OK);
        } catch (Exception e) {
            
            return new ResponseEntity<>("some error occured",HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    

    // method to delete a payload
    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<String> deleteLoads(@PathVariable String loadId) {
        try {
            this.loadServiceImpl.removeloads(loadId);
            return new ResponseEntity<>("loads details deleted successfully",HttpStatus.OK);
        } catch (Exception e) {
            
            return new ResponseEntity<>("some error occured",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

