package chapter11.ex4;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> names = new ArrayList<>();
        names.add("Motso");
        names.add("John");
        names.add("Mike");

        System.out.println(names);

        
        // add (insert) another element at a specific index
        names.add(2,"Lebza");
        System.out.println(names);
        if (names.contains("Mike")){
            names.remove("Mike");
        }

        System.out.println(names);


	    // Check for the existence of a specific String element.
        //   If it exists, remove it.
        
    }
}
