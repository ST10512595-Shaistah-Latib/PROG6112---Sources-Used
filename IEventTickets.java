/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.eventcompany;

/**
 *
 * @author shaistahlatib
 */
public interface IEventTickets {
    
    public double CalculateTicketPrice (double price, double tickets);
    
    public boolean ValidateData (String event, double price, double tickets);
    
}
