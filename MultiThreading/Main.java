package MultiThreading;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Main thread starts here." + Thread.currentThread().getName());
        MultithreadingLearning runnableObj = new MultithreadingLearning();
        Thread t1 = new Thread(runnableObj);
        t1.start();
        System.out.println("Finish thread ends here." + Thread.currentThread().getName());
    }
    
}
