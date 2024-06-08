/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.refined;

/**
 *
 * @author vandycklai
 */
public class Main {
    public static void main(String[] args) {
        Hardware server = HardwareFactory.createHardware("Server", "HW1", "Server A");
        Hardware workstation = HardwareFactory.createHardware("Workstation", "HW2", "Workstation A");

        Software software1 = Software.getInstance("SW1", "OS A", "1.0");
        Software software2 = software1.clone(); // Prototype pattern for cloning

        Franchise franchise = new Franchise("F1", "New York");
        FranchiseObserver securityObserver = new SecurityObserver();
        franchise.addObserver(securityObserver);

        FranchiseManager manager = new FranchiseManager("M1", "John Doe");

        manager.manageHardware(franchise, server);
        manager.manageHardware(franchise, workstation);
        manager.manageSoftware(franchise, software1);
        manager.manageSoftware(franchise, software2);
        franchise.configureAllHardware();

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
