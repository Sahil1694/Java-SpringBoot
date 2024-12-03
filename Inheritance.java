public class Inheritance {
    static class vehicle{
        String color;
        int speed;
        String model;

        void getcolor(){
            System.out.println("Color: "+color);
        }
        void setcolor(String color){
            this.color = color;
        }

        void start(){
            System.out.println("Vehicle Started");
        }
    }

    //Inherit the Properties of Vechicle Class
    static class car extends vehicle{
    }

    public static void main(String[] args) {
        car alto = new car();
        alto.setcolor("Red");
        alto.getcolor();
        alto.start();

    }
    
}
