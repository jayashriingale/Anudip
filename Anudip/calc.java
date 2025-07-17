import java.io.*;
import java.util.Scanner;
class calc
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double pen,pencil,eraser,a,c,total;
        
        System.out.println("Adding pen");
        pen=s.nextDouble();
        System.out.println("Adding pencil");
        pencil=s.nextDouble();
        System.out.println("Adding eraser");
        eraser=s.nextDouble();

        a=pen+pencil+eraser;
        total=a*0.18;
        c=a+total;
        System.out.println("After ppe adding gst"+c);
        
    }
}

operators
