package MultiThreading.ImpExample;

public class ConsumeTask implements Runnable{

    SharedResource sharedResource;

    ConsumeTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run(){
        System.out.println("Consumer thread starts here." + Thread.currentThread().getName());
        sharedResource.consumeItems();
    }
    
}
