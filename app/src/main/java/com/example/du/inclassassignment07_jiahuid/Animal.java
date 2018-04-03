package com.example.du.inclassassignment07_jiahuid;

/**
 * Created by du on 3/10/18.
 */

import java.io.Serializable;

public class Animal implements Serializable {
    // has 4 instance variables to collect data (3 String, 1 boolean)
    private String name;
    private int legs;
    private String information;
    private boolean hasFur;

    // has constructor accepting all as parameters
    public Animal(String name, int legs, boolean hasFur, String information) {
        this.name = name;
        this.legs = legs;
        this.information = information;
        this.hasFur = hasFur;
    }

    public String getName() {
        return name;
    }

    // can easily create getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    // has a toString() that returns something like: "Animal Type/Name: " + animalName + "\nNumber of Legs:

    @Override
    public String toString() {
        return "Animal Type/Name: " + name + "\nNumber of Legs: " + legs + "\nDoes it have Fur? " + hasFur + "\nAny additional information: " + information;
    }
}
