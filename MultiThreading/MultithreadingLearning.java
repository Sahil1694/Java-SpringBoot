package MultiThreading;

public class MultithreadingLearning implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread started: " + Thread.currentThread().getName());
    }
    
}
