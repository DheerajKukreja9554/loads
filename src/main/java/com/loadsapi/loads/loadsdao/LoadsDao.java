package com.loadsapi.loads.loadsdao;

import com.loadsapi.loads.entitity.Payload;

import org.springframework.data.jpa.repository.JpaRepository;


// Dao  layer to connect to postgres database and run queries
public interface LoadsDao extends JpaRepository<Payload,String> {
    
}
