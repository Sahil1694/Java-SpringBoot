package MultiThreading.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(2);
        

        //Creating producer thread using Lambda Expression
        Thread producerThread = new Thread(() -> {
            try{
                for(int i = 0 ; i < 6 ; i++){
                    sharedResource.produce(i);
                }
            }catch(Exception e){
                
            }
        });


        //Creating consumer thread using Lambda Expression
        Thread consumerThread = new Thread(() -> {
            try{
                for(int i = 0 ; i < 6 ; i++){
                    sharedResource.consume();
                }
            }catch(Exception e){
                
            }
        });

        producerThread.start();
        consumerThread.start();
    }
    
}
