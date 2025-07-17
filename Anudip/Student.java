// Q2. Encapsulation
// Problem:
// Create a `Student` class with private field `marks` and public getter/setter methods. Use validation in setter to
// prevent invalid values.
// Test Case:
// Student s = new Student();
// s.setMarks(85);
// System.out.println("Marks: " + s.getMarks());
// Expected Output:
// Marks: 85

class Student{
    private int marks;
    
    public void setMarks(int marks){
        if( marks <=100 && marks <=0){
        System.out.println("Invalid marks");
    }
        this.marks=marks;
    }
    
    public int getMarks()
    {
        return marks;
    }
    

     public static void main(String args[]){
        Student s = new Student();
        s.setMarks(85);
        System.out.println("Marks: " + s.getMarks());

     }
}