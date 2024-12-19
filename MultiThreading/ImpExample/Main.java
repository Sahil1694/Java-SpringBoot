package MultiThreading.ImpExample;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread starts here.");
        SharedResource sharedResource = new SharedResource();

        //Produscer Thread
        Thread producerThread = new Thread(new ProduceTask(sharedResource));
        //Consumer Thread
        Thread consumerThread = new Thread(new ConsumeTask(sharedResource));

        //Thread is in Runnable state
        producerThread.start();
        consumerThread.start();

        System.out.println("Main thread ends here.");
    }
    
}
