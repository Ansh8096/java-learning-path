package innerClasses.anonymousInnerClass;

public class TESTING {
    public static void main(String[] args) {
        shoppingCart shoppingCart = new shoppingCart(150);
//        shoppingCart.processPayment(new payment()); // we can't do this, beacuz we can't create the object of the interface...

        // this is the simple way to create the object of the class that implements the interface...
        // if we want to use the method of interface...
        creditCard_V0 creditCard = new creditCard_V0("987928574007");
        System.out.println("credit card number is : " + creditCard.getCreditCardNumber());
        shoppingCart.processPayment(creditCard);

//  ANONYMOUS INNER CLASS:---->
    // we use this when we want to create the object of the class (for one time use only) that implements the Interface...
    // By using this class we can avoid creating the 'creditCard_v0' class, because are work is done by the anonymous inner class...
        shoppingCart.processPayment(new Payment(){
            @Override
            public void pay(double amount) {
                System.out.println(amount + " is paid using the credit card...");
            }
        });
    }
}
