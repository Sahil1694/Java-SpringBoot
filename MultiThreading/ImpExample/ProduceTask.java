package MultiThreading.ImpExample;

public class ProduceTask implements Runnable {

    SharedResource sharedResource;

    ProduceTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run(){
        System.out.println("Producer thread starts here." + Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            //Exception Handling
        }
        sharedResource.addItems();
    }
    
}
