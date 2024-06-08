/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.refined;

/**
 *
 * @author vandycklai
 */
public class SecureHardwareDecorator implements Hardware {
    private Hardware decoratedHardware;

    public SecureHardwareDecorator(Hardware decoratedHardware) {
        this.decoratedHardware = decoratedHardware;
    }

    @Override
    public void configure() {
        decoratedHardware.configure();
        enableSecurity();
    }

    private void enableSecurity() {
        System.out.println("Enabling security features for hardware: " + decoratedHardware.getName());
        // Implement security mechanisms here
    }

    @Override
    public String getHardwareId() {
        return decoratedHardware.getHardwareId();
    }

    @Override
    public String getName() {
        return decoratedHardware.getName();
    }

    @Override
    public String getType() {
        return decoratedHardware.getType();
    }
}