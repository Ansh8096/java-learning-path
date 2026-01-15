package encapsulation;

public class bankAccount {
    private long accountNumber;
    private double bankBalance;

    public String getAccountNumber() {
        return ("Account number : "+accountNumber);
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void deposit(double amount){
        if(amount > 0 ){
            bankBalance += amount;
            System.out.println("Deposited : " + amount);
        }
        else System.out.println("Invalid Deposit Amount");
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= bankBalance){
            bankBalance -= amount;
            System.out.println("withdrew :" + amount);
        }
        else System.out.println("Invalid Amount Or Insufficient Balance");
    }

}
