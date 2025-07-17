import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int i=0;i<=n;i++)
        {
            int revnum=n%10;
            rev=rev*10+revnum;
            n/=10;
        }
        System.out.println(rev);
    }
}