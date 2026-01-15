package MULTI_THREADING.ThreadCommunication;

class SharedResources{
    private int data;
    private boolean hasData;

    // This 'Thread Communication' will only work under 'synchronized' (automatic locking)...
    public synchronized void produce(int value){
       while(hasData){ // if data is already present → wait
           try {
               wait();
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
           }
       }
        // Now produce the value
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // wake up consumer
        // notifyAll(); // This is used,when there are multiples Threads...
    }

    public synchronized int consume(){
        while(!hasData){ // if no data → wait (hasData == false)...
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // wake up producer
        return data;
    }
}

// Producer Thread...
class Producer implements Runnable{
    private SharedResources resource;

    public Producer(SharedResources resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            resource.produce(i);
        }
    }
}

// Consumer Thread...
class Consumer implements Runnable{
    private SharedResources resource;

    public Consumer(SharedResources resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            int value = resource.consume();
        }
    }
}

public class Example {
    public static void main(String[] args) {

        SharedResources resource = new SharedResources();

        Thread producerThread = new Thread(new Producer(resource),"producerThread");
        Thread consumerThread = new Thread(new Consumer(resource),"consumerThread");

        producerThread.start(); consumerThread.start();
    }
}
