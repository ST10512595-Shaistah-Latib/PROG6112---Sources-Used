/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shaistahlatib
 */

    ```java
// Question 1.2
@Test
public void CalculateTotalTicketPrice_CalculatedSuccessfully() {

    MovieTickets obj = new MovieTickets();

    double result = obj.CalculateTotalTicketPrice(4, 150);

    assertEquals(600, result, 0.01);
}


// Question 1.3
@Test
public void TotalMovieSales_ReturnsTotalSales() {

    MovieTickets obj = new MovieTickets();

    int[] sales = {200, 300, 500};

    int result = obj.TotalMovieSales(sales);

    assertEquals(1000, result);
}


// Question 2.1
@Test
public void ValidateData_ValidData_ReturnsTrue() {

    MovieTickets obj = new MovieTickets();

    boolean result = obj.ValidateData("Oppenheimer", 150, 3);

    assertTrue(result);
}


// Question 2.2
@Test
public void ValidateData_InvalidPrice_ReturnsFalse() {

    MovieTickets obj = new MovieTickets();

    boolean result = obj.ValidateData("Damsel", -50, 2);

    assertFalse(result);
}


// Question 2.3
@Test
public void ValidateData_InvalidTickets_ReturnsFalse() {

    MovieTickets obj = new MovieTickets();

    boolean result = obj.ValidateData("Napoleon", 100, 0);

    assertFalse(result);
}


// Question 3.1
@Test
public void GetSalesOverLimit_ReturnsNumberOfSales() {

    ProductSales obj = new ProductSales();

    int[] sales = {100, 600, 800, 200, 900};

    int limit = 500;

    int result = obj.GetSalesOverLimit(sales, limit);

    assertEquals(3, result);
}


// Question 3.2
@Test
public void GetSalesUnderLimit_ReturnsNumberOfSales() {

    ProductSales obj = new ProductSales();

    int[] sales = {100, 600, 800, 200, 900};

    int limit = 500;

    int result = obj.GetSalesUnderLimit(sales, limit);

    assertEquals(2, result);
}
```
    
    //Question 1.1
    @Test
    public void AverageSales_ReturnsCorrectAverage() {
        ProductSales obj = new ProductSales();
        int[] sales = {100, 200, 300, 400};
        double result = obj.AverageSales(sales);
        assertEquals(250, result, 0.01);
    }
    
    @Test
    public void MaxSale_ReturnsHighestSale() {
        ProductSales obj = new ProductSales();
        int[] sales = {250, 800, 450, 600};
        int result = obj.MaxSale(sales);
        assertEquals(800, result);
    }
    
    @Test
    public void ValidateData_ValidNameAndPrice_ReturnsTrue() {
        EstateAgent obj = new EstateAgent();
        boolean result = obj.ValidateData("John", 250000);
        assertTrue(result);
    }
    
    
   @Test
   public void ValidateData_EmptyName_ReturnsFalse() {
        EstateAgent obj = new EstateAgent();
        boolean result = obj.ValidateData("", 250000);
        assertFalse(result);
   }
   
   @Test
   public void ValidateData_InvalidPrice_ReturnsFalse() {
        EstateAgent obj = new EstateAgent();
        boolean result = obj.ValidateData("Sarah", -100);
        assertFalse(result);
   }
   
   @Test
   public void TopMovie_ReturnsHighestSellingMovie() {
       MovieTickets obj = new MovieTickets();
       String[] movies = {"Napoleon", "Damsel", "Oppenheimer"};
       int[] sales = {200, 500, 800};
       String result = obj.TopMovie(movies, sales);
       assertEquals("Oppenheimer", result);
   }
   
   @Test
   public void CalculateCommission_ReturnsCorrectCommission() {
       MovieTickets obj = new MovieTickets();
       double result = obj.CalculateCommission(500000, 5);
       assertEquals(25000, result, 0.01);
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
