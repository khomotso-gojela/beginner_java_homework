
package chapter5.ex1;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        
        // Test quantity and modify message if quantity > 1.
        if (quantity > 1)
            message = message+"s";
         
        
        // Test outOfStock and notify user in either case.
        if (outOfStock)
            System.out.println("The item you are buying is out of stock.");
        else
            System.out.println(message + "\nTotal cost with tax is: " + total);
        
        
        
    }
    
}
