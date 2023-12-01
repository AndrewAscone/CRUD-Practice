package com.Scone.CRUD.Practice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Band {

    @Id
    @GeneratedValue
    private Long id;
    private String bandName;
    private String genre;
    private int yearFormed;

    public Band(){

    }

    public Band(Long id, String bandName, String genre, int yearFormed){
        this.id = id;
        this.bandName = bandName;
        this.genre = genre;
        this.yearFormed = yearFormed;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getBandName(){
        return bandName;
    }

    public void setBandName(String bandName){
        this.bandName = bandName;
    }
}
