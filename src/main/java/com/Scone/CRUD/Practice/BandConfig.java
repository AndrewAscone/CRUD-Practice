package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BandConfig {
    @Autowired
    private BandRepository repository;
}
