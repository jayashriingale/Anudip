// Q4. Abstraction with Interface
// Problem:
// Create an interface `Flyable` with method `fly()`. Implement it in classes `Bird` and `Aeroplane`.
// Test Case:

// Flyable f1 = new Bird();
// Flyable f2 = new Aeroplane();
// f1.fly();
// f2.fly();
// Expected Output:
// Bird flies by flapping wings.
// Aeroplane flies using engines.

interface Flyable{
    void fly();
    
    class Flyable implements Bird{
        void fly(){
        System.out.println("Bird flies by flapping wings");
    }
        
    }

    class Flyable implements Aeroplane{
        void fly(){       
        System.out.println("Aeroplane flies using engines");
        }
    }

    public static void main(String args[]){
        Flyable f1 = new Bird();
        Flyable f2 = new Aeroplane();
        f1.fly();
        f2.fly();

     }
}