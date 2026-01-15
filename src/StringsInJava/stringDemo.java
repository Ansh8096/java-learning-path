package StringsInJava;

public class stringDemo {
    static void main() throws InterruptedException {

    // String class :-------->
        // In this ex,we will be creating new temporary string 100 times which can lead to a very poor performance & more memory usage ...
        String str = "";
        for (int i=0;i<100;i++){
            str += "hello";
        }
        // System.out.println(str);


    // String Builder Class:------->
        // It makes changes to one string only, it doesn't create any temporary string...
        // After making all of our changes we can convert this stringBuilder into final string using 'toString()' method...
        // It allows method chaining and is mutable , because of this it is not thread-safe...
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world").append("!");
        // sb.reverse();
        sb.replace(6,12,"java");
        System.out.println(sb);

        String finalString = sb.toString();
        System.out.println(finalString);


    // String Builder synchronization example:
        StringBuilder stringBuilder = new StringBuilder();
        task t1 = new task(stringBuilder);
        task t2 = new task(stringBuilder);
        t1.start(); t2.start();

        t1.join();
        t2.join();

        // there is no surety that we will get expected size (i.e: 2000), because stringBuilder is not safe...
        System.out.println("Final size of stringBuilder: " + stringBuilder.length());
    }
}

class task extends Thread{

    StringBuilder sb;

    public task(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++) {
            sb.append("a");
        }
    }
}