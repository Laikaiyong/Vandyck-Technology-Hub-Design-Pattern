/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.refined;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author vandycklai
 */
public class Franchise {
    private String franchiseId;
    private String location;
    private List<Hardware> hardwares;
    private List<Software> softwares;
    private List<FranchiseObserver> observers;

    public Franchise(String franchiseId, String location) {
        this.franchiseId = franchiseId;
        this.location = location;
        this.hardwares = new ArrayList<>();
        this.softwares = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // Methods to add hardware and software
    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
        notifyObservers();
    }

    public void addSoftware(Software software) {
        softwares.add(software);
        notifyObservers();
    }

    // Composite Pattern Methods
    public void configureAllHardware() {
        for (Hardware hardware : hardwares) {
            hardware.configure();
        }
    }

    // Observer Pattern Methods
    public void addObserver(FranchiseObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(FranchiseObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (FranchiseObserver observer : observers) {
            observer.update(this);
        }
    }

    // Getters and Setters
    public String getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(String franchiseId) {
        this.franchiseId = franchiseId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public void setHardwares(List<Hardware> hardwares) {
        this.hardwares = hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(List<Software> softwares) {
        this.softwares = softwares;
    }
}

