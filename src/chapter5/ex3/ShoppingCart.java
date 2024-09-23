
package chapter5.ex3;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);

        System.out.print("Items purchased: ");
        // Iterate through and print out the items from the items array
        for (int i = 0;i < items.length;i++)
            System.out.print(items[i] + " ");
        
    }    
}
