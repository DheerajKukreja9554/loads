package com.loadsapi.loads.loadservices;

import java.util.List;

// import javax.websocket.server.ServerEndpoint;

import com.loadsapi.loads.entitity.Payload;
import com.loadsapi.loads.loadsdao.LoadsDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadServiceImpl implements LoadServices{
    
    @Autowired
    private LoadsDao payloads;

    @Override
    public List<Payload> getloads() {
        return payloads.findAll();
    }

    @Override
    public Payload getloads(String shipperId) {
        return payloads.getById(shipperId);
    }

    
    @Override
    public void addloads(Payload load) {
        payloads.save(load);
    }

    @Override
    public void changeloads(Payload load) {

        payloads.save(load);
    }

    @Override
    public void removeloads(String shipperId) {
        payloads.delete(payloads.getById(shipperId));
    }
}
