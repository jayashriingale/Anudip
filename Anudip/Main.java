public class Main
{
    public static void main (String args[])
{
    try
    {
        int result=10/0;
        System.out.println("Result is:"+result);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Caught an error by zero");
    }
    finally
    {
        System.out.println("This block always run");
    }
}

}