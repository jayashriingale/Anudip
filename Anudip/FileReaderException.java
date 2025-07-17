import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileReaderException
{
    public static void main(String args[])
    {
        File file=new File("data.txt");
        Scanner sc=null;
        try{
            sc=new Scanner(file);
            System.out.println("File Contents");
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
        }
    }
}