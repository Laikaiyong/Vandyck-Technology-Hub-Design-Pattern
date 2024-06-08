/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.refined;

/**
 *
 * @author vandycklai
 */
public class WorkstationHardware implements Hardware {
    private String hardwareId;
    private String name;
    private String type;

    public WorkstationHardware(String hardwareId, String name) {
        this.hardwareId = hardwareId;
        this.name = name;
        this.type = "Workstation";
    }

    @Override
    public void configure() {
        System.out.println("Configuring workstation hardware: " + name);
    }

    // Getters
    @Override
    public String getHardwareId() {
        return hardwareId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
}