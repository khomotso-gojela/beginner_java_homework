
package chapter8.ex1;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	//   message.
        item1.setColor(' ');
        if (item1.setColor(' ')){
            System.out.println(item1.color);
        } else {
            System.out.println("Invalid color");
        }

       // Test the class, using both valid and invalid colors.

        
    }
}
