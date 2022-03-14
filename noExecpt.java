import java.util.Scanner;

/*Create a program to accept a number from user and check if it is Even or Odd. 
If it is Even, throw Even Number Found Exception. If the number is Odd, 
throw Odd Number Found Exceptio.*/

class myException extends Exception
{
    myException(String m)
    {
        super(m);
    }
}

public class noExecpt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int a = sc.nextInt();
        try
        {
        if(a%2==0)
        {
            throw new myException("Even Number Found Exception");
        }
        else
        {
            throw new myException("Odd Number Found Exception");
        }
        }
        catch(myException e)
        {
            System.out.println(e);
        }
        sc.close();
    }
}