import java.util.Scanner;
import java.io.*;
class UnderAgeException extends Exception
{
    public UnderAgeException(String message)
    {
        super(message);
    }
}
    class Vote{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Age");
        int age=sc.nextInt();
        try {
            
                if(age<0)
                {
                    throw new UnderAgeException("Invalid Age");
                }  
                if(age<18)
                {
                    throw new UnderAgeException("Not Eligible to vote");
                    
                }
                else{
                       System.out.println("Eligible to vote");
                    }       
            }
        catch(UnderAgeException e)
        {
            System.out.println(e);
        } 
  }
}