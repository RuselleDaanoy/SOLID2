public class SeniorCitizen implements Discount{

    @Override
    public double calculateDiscount(double amount){
        return amount * 0.10;
    }
}