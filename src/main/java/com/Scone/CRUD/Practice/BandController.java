package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BandController {
    private BandService service;

    @Autowired
    public BandController(BandService service){
        this.service = service;
    }
    //create, read by id, read all, update by id, delete by id
    //endpoints: PostMapping, GetMapping, PutMapping, DeleteMapping
}
