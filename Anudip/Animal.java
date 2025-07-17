// Q6. Method Overriding
// Problem:
// Create a class `Animal` with method `makeSound()`. Extend it in `Dog` and `Cat` classes and override the
// method.
// Test Case:
// Animal a1 = new Dog();
// Animal a2 = new Cat();
// a1.makeSound();
// a2.makeSound();
// Expected Output:
// Bark
// Meow

public class Animal{
    void makeSound()
    {
        System.out.println("Animals Sound");
    }
}
    class Dog extends Animal{
        void makeSound(){
            System.out.println("Bark");
    }

    }

    class Cat extends Animal{
            void makeSound(){
            System.out.println("Meow");
    }
    
    public static void main(String args[]){
        
    Animal a1 = new Dog();
    Animal a2 = new Cat();
    a1.makeSound();
    a2.makeSound();
    }
}