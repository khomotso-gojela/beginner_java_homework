package chapter12.ex1;

public class Shirt extends Item{
    char size,colorCode;

    Shirt(double price, char size, char colorCode){
        super("Shirt",price);
        this.size = size;
        this.colorCode = colorCode;
    }
}
