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
}
