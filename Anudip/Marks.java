import java.util.*;
class Marks
{
    public static void main(String args[])
    {
        System.out.println("Enter Marks of 5 Subject");
        Scanner sc=new Scanner(System.in);
        int Java=sc.nextInt();
        int Python=sc.nextInt();
        int DBMS=sc.nextInt();
        int CPP=sc.nextInt();
        int CC=sc.nextInt();
        int total=Java+Python+DBMS+CPP+CC;
        int per=total/5;
        System.out.println("Total:" +total);
        System.out.println("Percentage:" +per);
        if(per<100 && per>85)
        {
            System.out.println("Grade O");
        }
        else if(per<85 && per>75)
        {
           System.out.println("Grade A");
        }
        else if(per<75 && per>60)
        {
           System.out.println("Grade B");
        }
        else if(per<60 && per>40)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}