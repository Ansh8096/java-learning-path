package ExceptionHandling.customException;

public class insufficientFundException extends Exception{

    private double amount;
    public double getAmount() {
        return amount;
    }

    public insufficientFundException(double amount){
        super("what you are doing? , You don't have enough money");
        this.amount = amount;
    }

    // we can also override the 'toString()' method of super class, to get our message print when we get this error...
//    @Override
//    public String toString() {
//        return "what do you want ? , You don't have enough money";
//    }
}
