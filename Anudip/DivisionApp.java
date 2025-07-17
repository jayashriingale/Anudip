import java.util.Scanner;

public class DivisionApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numerator");
        int a=sc.nextInt();
        System.out.println("enter a denomenator");
        int b=sc.nextInt();
        try{
            int result=a/b;
            System.out.println("Result is:"+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
        catch(Exception e)
        {
            System.out.println("Unexcepted exception");
        } 
        finally
        {
             System.out.println("always runs");
        }
    }
}