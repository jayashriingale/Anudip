// Method Overloading
// Problem:
// Create a `Calculator` class with overloaded methods `add(int, int)` and `add(int, int, int)`.
// Test Case:
// Calculator c = new Calculator();
// System.out.println(c.add(2, 3));
// System.out.println(c.add(1, 2, 3));
// Expected Output:
// 5
// 6

class Calculator{
    
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
        
    }
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(1, 2, 3));
    }
}