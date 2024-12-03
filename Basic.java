class Basic{

    static class student{
        int rollNumber;
        int marks;
        String name;

        void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        void setMarks(int marks) {
            this.marks = marks;
        }

        void setName(String name) {
            this.name = name;
        }
                
    }


   public static void main(String[] args){

    student s1 = new student();
    s1.setRollNumber(1);
    s1.setMarks(100);
    s1.setName("Rahul");
    System.out.println(s1.marks);

   }

}