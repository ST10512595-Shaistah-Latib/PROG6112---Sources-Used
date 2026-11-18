/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author shaistahlatib
 */
public interface IEstateAgent {
    
    double CalculateCommission(double price, double percentage);
    
    boolean ValidateData(String location, String name, double price, double percentage);

    
}
