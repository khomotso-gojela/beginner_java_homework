
package chapter11.ex3;

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60),
                    new Item("WristBand",0), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        double total = 0;
        for (Item cartItem: items){
            if (cartItem.isBackOrdered()) continue;
            total += cartItem.getPrice();
        }
        System.out.println("Total : "+total);
    }
}
