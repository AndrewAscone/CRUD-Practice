package com.Scone.CRUD.Practice;

import javax.persistence.*;

@Entity
public class BandMember {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String instrument;

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
