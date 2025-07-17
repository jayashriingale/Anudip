import java.util.*;
class Income
{
    public static void main(String args[])
    {
        System.out.println("Enter Income");
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<500000)
        {
            System.out.println("0% Tax");
        }
        else if(income>500000 && income<1000000)
        {
            System.out.println("20% Tax");
        }
        else
        {
          System.out.println("30% Tax");  
        }
    }
}