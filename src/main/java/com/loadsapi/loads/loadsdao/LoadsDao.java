package com.loadsapi.loads.loadsdao;

import com.loadsapi.loads.entitity.Payload;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadsDao extends JpaRepository<Payload,String> {
    
}
