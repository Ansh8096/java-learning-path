package ExceptionHandling.customException;

public class bankAccount{

    private double balance;

    public bankAccount(double balance){
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws insufficientFundException{
        if(amount>balance){

//            throw new Exception ("insufficient balance...");

            // Now we can use catch with our own-custom-made exception class:
            throw new insufficientFundException (amount);
        }
        balance -= amount;
    }

}
