/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.simpler;

/**
 *
 * @author vandycklai
 */
public class FranchiseManager {
    private String managerId;
    private String name;

    public FranchiseManager(String managerId, String name) {
        this.managerId = managerId;
        this.name = name;
    }

    // Methods to manage hardware and software
    public void manageHardware(Franchise franchise, Hardware hardware) {
        franchise.addHardware(hardware);
    }

    public void manageSoftware(Franchise franchise, Software software) {
        franchise.addSoftware(software);
    }

    // Getters and Setters
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

