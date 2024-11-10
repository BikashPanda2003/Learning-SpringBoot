package com.bikash.homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("chocolate")
public class Chocolate implements Frosting,Syrup{
    @Override
    public String getFrostingtype() {
        return "Chocolate Frosting";
    }
    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
