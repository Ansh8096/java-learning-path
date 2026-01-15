package MULTI_THREADING.LOCKS.DeadLock;

class Pen{
    // synchronized sets the lock...
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is done using pen" + this + " trying to get paper " + paper );
        paper.finishWriting(); // it wants the paper lock...
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper{
    // synchronized sets the lock...
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is done using paper" + this + " trying to use pen " + pen );
        pen.finishWriting(); // it wants the pen lock...
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

class task1 implements Runnable{

    private Pen pen;
    private Paper paper;

    public task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}
class task2 implements Runnable{

    private Pen pen;
    private Paper paper;

    public task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {

        // Using 'synchronized' keyWord will help us here to avoid deadlock...
        // Now because of 'synchronized' task2 will only acquire the 'paper' lock when the 'pen' lock is available...
        synchronized (pen) {
            paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen
        }
    }
}
public class Example {
    public static void main(String[] args) {
        Paper paper = new Paper();
        Pen pen = new Pen();

        task1 t1 = new task1(pen,paper);
        task2 t2 = new task2(pen,paper);

        Thread thread1 = new Thread(t1,"Thread1");
        Thread thread2 = new Thread(t2,"Thread2");

        thread1.start(); thread2.start();
    }
}
