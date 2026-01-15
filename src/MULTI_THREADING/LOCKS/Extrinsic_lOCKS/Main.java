package MULTI_THREADING.LOCKS.Extrinsic_lOCKS;

public class Main {
    public static void main(String[] args){
        BankAccount BOB = new BankAccount();

        // Anonymous Inner class:
        Runnable task = new Runnable() {
            @Override
            public void run() {
              BOB.withdrawAmount(50);
            }
        };

        // This is the type of the constructor in the 'thread' class...
        Thread t1 = new Thread(task,"t1");
        Thread t2 = new Thread(task,"t2");
        t1.start(); t2.start();
    }
}
