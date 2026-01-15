package encapsulation;

public class BankAccount_Test {
    public static void main(String[] args) {
        bankAccount ansh = new bankAccount();
        ansh.setAccountNumber(12312131);
        System.out.println(ansh.getAccountNumber());
        ansh.deposit(-10);
        ansh.withdraw(10);
        ansh.deposit(100000);
        ansh.withdraw(500);
        System.out.println(ansh.getBankBalance());
    }
}
