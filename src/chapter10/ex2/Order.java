
package chapter10.ex2;

public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        if (custType == NONPROFIT){
            discount = (total > 900) ? 10.00 : 5.00;
        }else if (custType == PRIVATE){
            discount = (total > 900) ? 7.00 : 0;
        }else if (custType == CORP){
            discount = (total < 500) ? 8.00 : 5.00;
        }        
    }
}
