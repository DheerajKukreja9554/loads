package com.loadsapi.loads.loadservices;

import java.util.List;

import com.loadsapi.loads.entitity.Payload;

// import org.hibernate.mapping.List;

public interface LoadServices {

    public List<Payload> getloads();
    public Payload getloads(String shipperId);
    public void addloads(Payload load);
    public void changeloads(Payload load);
    public void removeloads(String shipperId);


}
