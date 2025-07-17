// Q1. Class & Object Creation
// Problem:
// Create a class `Person` with fields `name` and `age`. Create two objects and print their details.
// Test Case:
// Person p1 = new Person("Alice", 25);
// Person p2 = new Person("Bob", 30);
// Expected Output:
// Name: Alice, Age: 25
// Name: Bob, Age: 30

class Person{
    String name ;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
         System.out.println("Name:"+name+" Age:"+age);
    }


    public static void main(String args[]){
    Person p1 = new Person("Alice", 25);
    Person p2 = new Person("Bob", 30);
    
    
}
}
