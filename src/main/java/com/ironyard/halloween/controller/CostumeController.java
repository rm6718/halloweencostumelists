package com.ironyard.halloween.controller;

import com.ironyard.halloween.data.Costume;
import com.ironyard.halloween.repositories.CostumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sam on 10/13/16.
 */
@RestController
public class CostumeController {

    private CostumeRepository costumeRepository;

    @Autowired
    public void setCostumeRepository(CostumeRepository aRepo) {
        this.costumeRepository = aRepo;
    }


    @RequestMapping(value = "/costume", method = RequestMethod.POST)
    public Costume save(@RequestBody Costume aCostume){
        costumeRepository.save(aCostume);
        return costumeRepository.findOne(aCostume.getId());
    }

    @RequestMapping(value = "/costume/update", method = RequestMethod.PUT)
    public Costume update(@RequestBody Costume aCostume){
        costumeRepository.save(aCostume);
        return costumeRepository.findOne(aCostume.getId());
    }

    @RequestMapping(value = "/costume/{id}", method = RequestMethod.GET)
    public Costume show(@PathVariable Long id){
        return costumeRepository.findOne(id);
    }

    @RequestMapping(value = "/costumes", method = RequestMethod.GET)
    public Iterable<Costume> list(){
        return costumeRepository.findAll();
    }

    @RequestMapping(value = "/costume/delete/{id}", method = RequestMethod.DELETE)
    public Costume delete(@PathVariable Long id){
        Costume deleted = costumeRepository.findOne(id);
        costumeRepository.delete(id);
        return deleted;
    }
}
