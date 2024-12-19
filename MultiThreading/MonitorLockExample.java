package MultiThreading;

public class MonitorLockExample {

    public synchronized void task1(){
        //do- something
        try{
            System.out.println("inside Task1");
            Thread.sleep(10000);
        }catch(Exception e){
            //Exception Hanling
        }
    }

    public void task2(){
        System.out.println("inside Task2 , but before Synchronized block");
        synchronized(this){
            System.out.println("inside Task2 , inside Synchronized block");
        }
    }
    public void task3(){
        System.out.println("task3");
    }
    
}
