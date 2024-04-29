public class Customer {
    String name;
    String discount;

    public Customer(String name, String discount){
        this.name = name;
        this. discount = discount;
    }

    public double applyDiscount(double amount){
        return amount - discount.calculateDiscount(amount);
    }
}
