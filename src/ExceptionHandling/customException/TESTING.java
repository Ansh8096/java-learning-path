package ExceptionHandling.customException;

public class TESTING {
    public static void main(String[] args) {
        bankAccount Ansh = new bankAccount(10.0);
        try{
            Ansh.withdraw(15.0);
        }

        // Now we can use catch with our own-custom-made exception class:
        catch(insufficientFundException e){
            System.out.println(e);
            System.out.println(e.getAmount()); // we can also use these methods...
        }

    }
}
