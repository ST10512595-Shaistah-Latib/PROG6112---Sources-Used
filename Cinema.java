/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cinema;

/**
 *
 * @author shaistahlatib
 */
public class Cinema {

    public static void main(String[] args) {

        String[] movies = {"Napoleon", "Oppenheimer", "Damsel"};
        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600},
            {400, 350, 500}
        };

        //to display and calculate individual array item
        for (int i = 0; i < movies.length; i++) {
            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }
            System.out.println(movies[i]+ ": "+ total);
        }
        
        
        //to calculate the maximum value
        int max = sales[0][0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j< sales[i].length; j++) {
                if (sales[i][j] > max) {
                    max = sales[i][j];
                }
            }
        }
        System.out.println(max);

        
        //to calculate the minimum value
        int min = sales[0][0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j< sales[i].length; j++) {
                if (sales[i][j] < min) {
                    min = sales[i][j];
                }
            }
        }
        System.out.println(min);
        
        //to calculate the average when knowing the number of array items
        double average = 0;
        int total = 0;
        for(int i = 0; i < sales.length; i++) {
            for(int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }
        }
        
       average = (double) total / 9;
       System.out.println(average);
       
       
       
       //to calculate the average when you dont know te number of arrays
        double avg = 0;
        int ttl = 0;
        int count =0;
        for(int i = 0; i < sales.length; i++) {
            for(int j = 0; j < sales[i].length; j++) {
                ttl = ttl + sales[i][j];
                count++;
            }
        }
        
       average = (double) total / count;
       System.out.println(avg);
      
    //to count values and use if statement
    int num =0;
    for (int i = 0; i < sales.length; i++) {
        for(int j = 0; j < sales[i].length; j++){
            if(sales[i][j] > 300) {
                num++;
            }
        }
    }
    System.out.println("Number of sales above 300:" + num);
       
    //to calculate each movie total and put it in a new array
    int[] totalSales = new int[movies.length];
    for(int i = 0; i < sales.length; i++) {
        int totl = 0;
    for(int j = 0; j < sales[i].length; j++) {
        totl = totl + sales[i][j];
    }
    totalSales[i] = total;
    }  
    
    //to find the highest value and get its position and display it
    int maximum = totalSales[0];
    int position = 0;
    for(int i = 0; i < totalSales.length; i++) {
        if(totalSales[i] > max) {
            max = totalSales[i];
            position = i;
        }
        System.out.println(movies[position]);
    }
    
    
    int[] totalsales = new int[movies.length];
    for(int i = 0; i < sales.length; i++) {
        int sum = 0;
        for (int j = 0; j < sales[i].length; j++){
            sum = sum + sales[i][j];
            
        }
        totalsales[i] = sum;
    }
    
    int highest = totalsales[0];
    int index = 0;
    for(int i = 0; i < totalsales.length; i++) {
        if(totalsales[i] > highest) {
            highest = totalsales[i];
            index = i;
        }
        System.out.println(movies[index]);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    } 
}
