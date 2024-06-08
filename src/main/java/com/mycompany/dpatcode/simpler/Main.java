/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.simpler;

/**
 *
 * @author vandycklai
 */
public class Main {
    public static void main(String[] args) {
        Hardware hardware1 = new Hardware("HW1", "Server A", "Server");
        Hardware hardware2 = new Hardware("HW2", "Workstation A", "Workstation");
        Software software1 = new Software("SW1", "OS A", "1.0");
        Software software2 = new Software("SW2", "App A", "2.0");

        Franchise franchise = new Franchise("F1", "New York");
        FranchiseManager manager = new FranchiseManager("M1", "John Doe");

        manager.manageHardware(franchise, hardware1);
        manager.manageHardware(franchise, hardware2);
        manager.manageSoftware(franchise, software1);
        manager.manageSoftware(franchise, software2);

        System.out.println("Franchise ID: " + franchise.getFranchiseId());
        System.out.println("Location: " + franchise.getLocation());
        System.out.println("Hardware in Franchise:");
        for (Hardware hw : franchise.getHardwares()) {
            System.out.println("* " + hw.getName() + " (" + hw.getType() + ")");
        }
        System.out.println("Software in Franchise:");
        for (Software sw : franchise.getSoftwares()) {
            System.out.println("* " + sw.getName() + " (Version: " + sw.getVersion() + ")");
        }
    }
}

