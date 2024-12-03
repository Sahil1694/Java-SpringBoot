public class Polymorphism {

    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a, int b , int c){
        return a+b+c;
    }


    public static void main(String[] args) {
        
        //sum method with 2 arguments
        System.out.println(sum(5,5 ));
        //sum method with 3 arguments
        System.out.println(sum(5,5,5));
    }
    
}
