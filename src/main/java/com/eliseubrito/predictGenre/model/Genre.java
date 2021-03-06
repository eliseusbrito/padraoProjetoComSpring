package com.eliseubrito.predictGenre.model;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Genre {

    @Id
    private String name;
    private String gender;
    private Double probability;
    private Integer count;

    public Genre(String name, String gender, Double probability, Integer count) {
        this.name = name;
        this.gender = gender;
        this.probability = probability;
        this.count = count;
    }

    public Genre() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
