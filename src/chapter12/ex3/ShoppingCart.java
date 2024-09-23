package chapter12.ex3;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        // call the display method on the object, then the getColor method
        Item shirt1 = new Shirt(220,'M','R');
        shirt1.display();
        if (shirt1 instanceof Item){
            String color  = ((Shirt) shirt1).getColor();
            System.out.println("Color : " + color);
        } else {
            System.out.println("Object is not a Shirt");
        }

    }
}
