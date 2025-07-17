class UnderAgeException extends Exception{
    public UnderAgeException(String message)
    {
        super(message);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String message)
    {
        super(message);
    }
}
class Register
{
    public static void Scanner(int age)throws UnderAgeException,OverAgeException
    {
        if(age<18)
        {
            throw new UnderAgeException("Not eligible");
        }
        else if(age>100)
        {
            throw new OverAgeException("Eligible to Registration");
        }
        else
        {
            System.out.println("Enter valid age for Registration");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        try{
            Scanner(20);
        }
        catch(UnderAgeException e)
        {
            System.out.println("Exception:" +e.getMessage());
        }
        catch(OverAgeException e)
        {
            System.out.println("Exception:" +e.getMessage());
        }
    }
}