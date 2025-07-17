// Q3. Abstraction with Abstract Class
// Problem:
// Create an abstract class `Vehicle` with an abstract method `start()`. Extend it in `Car` and `Bike` classes.
// Test Case:
// Vehicle v1 = new Car();
// Vehicle v2 = new Bike();
// v1.start();
// v2.start();
// Expected Output:
// Car starts with key.
// Bike starts with kick.

abstract class Vehicle{
    abstract void start();
    
    class Car extends Vehicle{
        void start(){
            System.out.println("Car starts with key");
        }
    }

    class Bike extends Vehicle{
        void start(){
            System.out.println("Bike starts with key");
        }
    }
    public static void main(String args[]){
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }

}