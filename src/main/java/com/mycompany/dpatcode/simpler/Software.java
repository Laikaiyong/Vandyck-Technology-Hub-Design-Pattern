/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.simpler;

/**
 *
 * @author vandycklai
 */
public class Software {
    private String softwareId;
    private String name;
    private String version;

    public Software(String softwareId, String name, String version) {
        this.softwareId = softwareId;
        this.name = name;
        this.version = version;
    }

    // Getters and Setters
    public String getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

