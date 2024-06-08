/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.refined;

/**
 *
 * @author vandycklai
 */
public class HardwareFactory {
    public static Hardware createHardware(String type, String hardwareId, String name) {
        switch (type) {
            case "Server":
                return new ServerHardware(hardwareId, name);
            case "Workstation":
                return new WorkstationHardware(hardwareId, name);
            default:
                throw new IllegalArgumentException("Unknown hardware type");
        }
    }
}
