package com.ironyard.halloween.data;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by sam on 10/12/16.
 */
@Entity
public class Costume {
    private String name;
    private double cost;
    private String category;
    private Date lastUsed;
    private int count;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Props> props;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Props> getProps() {
        return props;
    }

    public void setProps(List<Props> props) {
        this.props = props;
    }

    public List<ClothingItems> getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(List<ClothingItems> clothingItems) {
        this.clothingItems = clothingItems;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private List<ClothingItems> clothingItems;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


}
