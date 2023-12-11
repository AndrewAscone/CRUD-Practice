package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
public class BandConfig {
    @Autowired
    private BandRepository repository;

    @PostConstruct
    public void setup(){
        Band band1 = new Band();
        band1.setBandName("Grateful Dead");
        band1.setGenre("Rock");
        band1.setYearFormed(1965);

        repository.saveAll(Arrays.asList(band1));
    }
}
