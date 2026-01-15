package MULTI_THREADING.LambdaExpression;

public class lambdaExpression {
    public static void main(String[] args) {

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello,This is done by using anonymous Inner class...");
            }
        };

        Thread t1 = new Thread(task1);

        // We can only use this lambda expression on the functional Interface (means the interface have only one abstract method)...
        Runnable task2 = ()-> System.out.println("hello,this is done by using lambda expression...");
        // later we use this task2 in Thread constructor...
        Thread t2 = new Thread(task2);

        // WE CAN ALSO DIRECTLY USE THE LAMBDA EXPRESSION IN THE THREAD CONSTRUCTOR...
        // This is how it is done , when we want to write only one line of code inside run() method of 'Runnable interface'...
        // It helps us to prevent using the implement class or the anonymous inner class...
        Thread t3 = new Thread(()-> System.out.println("This is the work done by lambda expression..."));

        // This is how it is done , when we want to write more than one line of code inside run() method of 'Runnable interface'...
        Thread  t4 = new Thread(() ->  {
            for (int i = 0;i<5;i++){
                System.out.println("hello,this is done by using lambda expression...");
            }
        });


    }

}
