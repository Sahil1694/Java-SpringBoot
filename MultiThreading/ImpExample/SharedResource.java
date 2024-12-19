package MultiThreading.ImpExample;

public class SharedResource {

    boolean itemAvailabe = false;

    //syncronized keyword is used to make the method thread safe
    //syncronized put the Monitor lock on the method
    public synchronized void addItems(){
        itemAvailabe = true;
        System.out.println("Item added to the shared resource." + Thread.currentThread().getName() + "and Invoking othe rthread which are waiting");
        notifyAll();
    }

    public synchronized void consumeItems(){
        System.out.println("Consumer thread starts here." + Thread.currentThread().getName());

        //uding the while loop to avoid "spurious wakeup" sometime because of the OS
        while (itemAvailabe) {
            try{
                System.out.println("thread" + Thread.currentThread().getName() + "is waiting for the item to be added to the shared resource");
                wait(); // it will release the lock and wait for the notify
            }catch(Exception e){
                //Exception Handling
            }
        }
        System.out.println("Item consumed from the shared resource." + Thread.currentThread().getName());
        itemAvailabe = false;
    }
    
}
