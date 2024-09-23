
package chapter8.ex1;

public class Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char colorCode) {
        if (color == ' '){
            return false;
        } else {
            this.color = colorCode;
            return true;
        }
    };
}
