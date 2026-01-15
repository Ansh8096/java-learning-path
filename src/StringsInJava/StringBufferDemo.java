package StringsInJava;

public class StringBufferDemo {
    static void main() throws InterruptedException {
        // StringBuffer : It has all the methods of StringBuilder,it has all the methods synchronized...
                        // making it a thread-safe, Since all methods are synchronized it makes our operations slower...

        // StringBuffer synchronization example:
        StringBuffer SB = new StringBuffer();
        task1 t1 = new task1(SB);
        task1 t2 = new task1(SB);
        t1.start(); t2.start();

        t1.join();
        t2.join();

        // there is no surety that we will get expected size (i.e: 2000), because stringBuilder is not safe...
        System.out.println("Final size of StringBuffer: " + SB.length());
    }
}

class task1 extends Thread{

    StringBuffer sb;

    public task1(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++) {
            sb.append("a");
        }
    }
}