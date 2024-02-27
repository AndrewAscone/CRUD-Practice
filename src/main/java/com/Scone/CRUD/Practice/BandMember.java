package com.Scone.CRUD.Practice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BandMember {
    @Id
    @GeneratedValue
    private long id;
}
