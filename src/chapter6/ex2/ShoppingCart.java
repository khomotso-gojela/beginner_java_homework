

package chapter6.ex2;

public class ShoppingCart {

     public static void main(String args[]) {
          // Declare and initialize 2 Item objects
          Item item1 = new Item();
          item1.desc = "NIke shoes";

          Item item2 = new Item();
          item2.desc = "shirt";

	// Print both item descriptions and run code.
          item1 = item2;
          System.out.println(item1.desc);
          System.out.println(item2.desc);


	// Assign one item to another and run it again.

     }
 
} 
