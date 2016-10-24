package com.ironyard.halloween.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sam on 10/12/16.
 */
@Entity
public class Props {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


}
