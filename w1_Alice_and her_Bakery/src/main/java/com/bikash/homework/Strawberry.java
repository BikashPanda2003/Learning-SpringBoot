package com.bikash.homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("strawberry")
public class Strawberry implements Frosting,Syrup{
    @Override
    public String getFrostingtype() {
        return "Strawberry Frosting";
    }
    @Override
    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
