public class Order {
    double payment;
    double amount;

    public Order(double payment, double amount){
        this.payment = payment;
        this.amount = amount;
    }

    public double getPayment(){
        return payment;
    }

    public double getAmount(){
        return amount;
    }
}