import java.util.Scanner;

/* Create a Java program to implement user defined exception Not Prime 
Exception. Read number from command line and check whether number is 
prime or not. If it is prime then display message Number is Prime and if it 
is not prime throw the exception Not Prime Exception.*/

class myException1  extends Exception
{
    myException1(String e)
    {
        super(e);
    }
}

public class primeExecpt
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        args[0] =  sc.next();
        int n = Integer.parseInt(args[0]);
        int flag= 0;
        for(int i=0;i<n;i++)
        {
            if(n%i==0)
                flag =1;
        }

        try 
        {
            if(flag==1)
            {
                throw new myException1("Number is Prime");
            }
            else
            {
                throw new myException1("Number is no prime");
            }
        }
        catch(myException1 e)
        {
            System.out.println(e);
        }
    }
}