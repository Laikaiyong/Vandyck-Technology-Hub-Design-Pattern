/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dpatcode.refined;

/**
 *
 * @author vandycklai
 */
public class SecurityObserver implements FranchiseObserver {
    @Override
    public void update(Franchise franchise) {
        System.out.println("Security observer: A change has been made to franchise " + franchise.getFranchiseId());
    }
}

