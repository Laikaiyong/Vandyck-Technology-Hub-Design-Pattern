/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.simpler;

/**
 *
 * @author vandycklai
 */
public class Hardware {
    private String hardwareId;
    private String name;
    private String type;

    public Hardware(String hardwareId, String name, String type) {
        this.hardwareId = hardwareId;
        this.name = name;
        this.type = type;
    }

    public String getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
