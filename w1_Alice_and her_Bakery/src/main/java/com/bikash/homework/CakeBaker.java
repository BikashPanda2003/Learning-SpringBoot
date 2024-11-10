package com.bikash.homework;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CakeBaker {


    private final Frosting f;
    private final Syrup s;

    @Autowired
    public CakeBaker(Frosting f, Syrup s){
        this.f=f;
        this.s=s;
    }

    public String bakeCake(){
        return "Baking a cake using "+f.getFrostingtype()+" and "+s.getSyrupType();
    }
}
