/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinema;

/**
 *
 * @author shaistahlatib
 */
public class MovieTickets implements IMovieTickets {
    
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
       int total = 0;
      for(int i = 0; i < movieTicketSales.length; i++) {
          total = total + movieTicketSales[i];
      }  
      return total;
}
    
    @Override
    public String TopMovie(String[] movies, int totalSales[]) {
    int highest = totalSales[0];
    int position = 0;
    for(int i = 0; i < totalSales.length; i++) {
        if(totalSales[i] > highest) {
            highest = totalSales[i];
            position = i;
        }
    }
    return movies[position];
    }
}
