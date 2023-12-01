package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;

public class BandService {
    private BandRepository repository;

    @Autowired
    public BandService(BandRepository repository){
        this.repository = repository;
    }

    public Band create(Band band){
        return repository.save(band);
    }
}
