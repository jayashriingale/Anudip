class UnderAgeException extends Exception{
    public UnderAgeException(String message)
    {
        super(message);
    }
}
class VoterApp
{
    public static void checkEligibility(int age)throws UnderAgeException
    {
        if(age<18)
        {
            throw new UnderAgeException("You are not eligible for vote");
        }
        else
        {
            System.out.println("You are eligible for vote");
        }
    }
    public static void main(String args[])
    {
        try{
            checkEligibility(25);
        }
        catch(UnderAgeException e)
        {
            System.out.println("Exception:" +e.getMessage());
        }
    }
}