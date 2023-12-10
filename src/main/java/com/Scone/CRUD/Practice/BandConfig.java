package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class BandConfig {
    @Autowired
    private BandRepository repository;

    @PostConstruct
    public void setup(){

    }
}
