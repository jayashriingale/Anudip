import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
            }
        }
            if(isPrime==true)
            {
                System.out.println("Number is Prime");
            }
            else
            {
                System.out.println("Number isnot Prime");
            }
        

    }
}