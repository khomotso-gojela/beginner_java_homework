
package chapter4.ex2;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.
        float price = 31.3f,tax = 1.20f;
        byte quantity = 3;
        itemDesc = quantity > 1? "shirts": "shirt";
        float total = price * tax * quantity;
        
        // Modify message to include quantity 
        message = custName+" wants to purchase "+quantity+ " " +itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        System.out.println("Total cost with tax is: " + total);

    }    
}
