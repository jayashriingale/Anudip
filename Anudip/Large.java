import java.util.*;
class Large
{
    public static void main(String args[])
    {
      System.out.println("Enter 3 numbers");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
       if((a>b)&&(a>c))
       {
        System.out.println("a is larger");
       }
       else if((b>a)&&(b>c)){
        System.out.println("b is larger");
       }
       else{
          System.out.println("c is larger");
       }
    }
}