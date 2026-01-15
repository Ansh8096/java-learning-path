package innerClasses.anonymousInnerClass;

public class shoppingCart{

    private double totalAmount;

    public shoppingCart (double  totalAmount){
        this.totalAmount = totalAmount;
    }

    // Here we are taking the reference of Payment (interface) in the method...
    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }

}
