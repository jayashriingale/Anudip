import java.util.Scanner;
public class Sum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1; 
        while (i <= n) {
            sum += i;
            i++;      
        }

        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }
}