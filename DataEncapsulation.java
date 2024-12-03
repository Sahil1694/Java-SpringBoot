public class DataEncapsulation {

    //Bundles the Data into Single Unit and Hides the Data from the Outside World
    static class Dog{
        private String name;
        private int age;
        private String breed;
        
        public void setName(String name){
            this.name = name;
        }
        
        public void setAge(int age){
            this.age = age;
        }
        
        public void setBreed(String breed){
            this.breed = breed;
        }
        
        public String getName(){
            return name;
        }
        
        public int getAge(){
            return age;
        }
        
        public String getBreed(){
            return breed;
        }

    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Tommy");
        d.setBreed("Lab");
        d.setAge(5);
        System.out.println("Name: "+d.getName());
        System.out.println("Breed: "+d.getBreed());
        System.out.println("Age: "+d.getAge());

    }
    
}
