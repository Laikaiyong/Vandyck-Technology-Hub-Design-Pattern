/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.refined;

/**
 *
 * @author vandycklai
 */
public class Software implements Cloneable {
    private static Software instance;
    private String softwareId;
    private String name;
    private String version;

    private Software(String softwareId, String name, String version) {
        this.softwareId = softwareId;
        this.name = name;
        this.version = version;
    }

    public static Software getInstance(String softwareId, String name, String version) {
        if (instance == null) {
            instance = new Software(softwareId, name, version);
        }
        return instance;
    }

    @Override
    public Software clone() {
        try {
            return (Software) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
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

