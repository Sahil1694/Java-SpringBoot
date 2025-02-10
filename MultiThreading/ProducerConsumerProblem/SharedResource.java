package MultiThreading.ProducerConsumerProblem;
import java.util.*;;

public class SharedResource {
    private LinkedList<Integer> sharedBuffer;
    private int bufferSize;


    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int items) throws Exception{
        //If buffer is full, wait for consumer to consume
        while(sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }
        sharedBuffer.add(items);
        System.out.println("Producer produced: " + items);
        //Notify consumer that items are available to consume
        notify();
    }

    public synchronized int consume() throws Exception{
        //Buffer is Empty
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }
        int items = sharedBuffer.poll();
        System.out.println("Consumer consumed: " + items);
        //Notify producer that buffer is empty
        notify();
        return items;
    }
    
}
