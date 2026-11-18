/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author shaistahlatib
 */
public class EstateAgent implements IEstateAgent {
    //validate agent location - cannot be empty
    //validate agent name - cannot be empty
    //validate property price - cannot be <= 0
    //validate commission percentage - cannot be <= 0
    
    @Override
    public double CalculateCommission(double price, double percentage) {
        double commission = price * (percentage/100);
        return commission;
    }
    @Override
    public boolean ValidateData (String location, String name, double price, double percentage) {
        
        if (location.isEmpty() || name.isEmpty() || price <= 0 || percentage <= 0) {
        return false;
    } else {
        return true;
    }
    }
    
    
}
