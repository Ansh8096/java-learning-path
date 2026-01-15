package innerClasses.anonymousInnerClass;

public class creditCard_V0 implements Payment{

    private String creditCardNumber;

    public creditCard_V0(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " is paid using the credit card...");
    }
}
