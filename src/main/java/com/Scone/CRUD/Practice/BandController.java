package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BandController {
    private BandService service;

    @Autowired
    public BandController(BandService service){
        this.service = service;
    }
    //create*, read by id, read all, update by id, delete by id
    //endpoints: PostMapping, GetMapping, PutMapping, DeleteMapping
    @PostMapping(value = "/create")
    public ResponseEntity<Band> create(@RequestBody Band band){
        return new ResponseEntity<>(service.create(band), HttpStatus.CREATED);
    }

    @GetMapping(value = "/read/{id}")
    public ResponseEntity<Band> readById(@PathVariable Long id){
        return new ResponseEntity<>(service.readById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/readAll")
    public ResponseEntity<List<Band>> readAll(){
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Band> updateById(@PathVariable Long id, @RequestBody Band newData){
        return new ResponseEntity<>(service.update(id, newData), HttpStatus.OK);
    }
}
