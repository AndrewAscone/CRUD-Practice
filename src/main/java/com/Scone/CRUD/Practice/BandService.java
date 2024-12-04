package com.Scone.CRUD.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BandService {
    private final BandRepository repository;

    @Autowired
    public BandService(BandRepository repository){
        this.repository = repository;
    }

    public Band create(Band band){
        return repository.save(band);
    }

    public Band readById(Long id){
        return repository.findById(id).get();
    }

    public List<Band> readAll(){
        Iterable<Band> allBands = repository.findAll();
        List<Band> bandList = new ArrayList<>();
        allBands.forEach(bandList::add);
        return bandList;
    }

    public Band update(Long id, Band newBandData){
        Band bandInDatabase = this.readById(id);
        bandInDatabase.setBandName(newBandData.getBandName());
        bandInDatabase.setGenre(newBandData.getGenre());
        bandInDatabase.setYearFormed(newBandData.getYearFormed());
        bandInDatabase = repository.save(bandInDatabase);
        return bandInDatabase;
    }

    public Band deleteById(Long id){
        Band bandToBeDeleted = this.readById(id);
        repository.delete(bandToBeDeleted);
        return bandToBeDeleted;
    }
}
