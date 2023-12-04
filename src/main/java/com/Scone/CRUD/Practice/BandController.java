package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BandController {
    private BandService service;

    @Autowired
    public BandController(BandService service){
        this.service = service;
    }
    //create, read by id, read all, update by id, delete by id
    //endpoints: PostMapping, GetMapping, PutMapping, DeleteMapping
    @PostMapping(value = "/create")
    public ResponseEntity<Band> create(@RequestBody Band band){
        return new ResponseEntity<>(service.create(band), HttpStatus.CREATED);
    }
}
