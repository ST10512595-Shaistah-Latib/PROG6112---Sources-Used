/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventcompany;

/**
 *
 * @author shaistahlatib
 */
public class EventTickets implements IEventTickets {
    
    @Override
    public double CalculateTicketPrice (double price, double tickets) {
        double total;
           if (tickets > 5) {
            return total = price * tickets;
        } else {
            return total = (price * tickets)* 0.90;
        }
    }
    
    @Override
    public boolean ValidateData (String event, double price, double tickets) {
        
        if (event.equals("Select an Event")|| price <= 0 || tickets <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
