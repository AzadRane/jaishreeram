
/* Create a multithreading application to handle the following threads.
To display first 20 numbers divisible by 3.
To display first 20 terms of Fibonacci Series.
To display Welcome message 20 times*/


class Welcome extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<20;i++)
            {
                System.out.println("WELCOM");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


class divbyThree extends Thread  //pending correct logic
{
    public void run()
    {   
        try
    {

        int cnt=0;
        for(int i=0;i<60;i++)
        {
            if(i%3==0)
            {   cnt=cnt+1;
                System.out.println(i);
                
                if(cnt==20)
                    return;
            }
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}

class Fibbonacci extends Thread
{
    public void run()
    {
        try 
        {
            int a=1,b=1,c=0,n=20;
            System.out.println("==================================Fibbonacci series=====================");
            while(n>0);
            {
                System.out.println(c+" ");
                a=b;
                b=c;
                c=a+b;
                n=n-1;
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


public class multiThred 
{
    public static void main(String args[])
    {
            Fibbonacci f1 = new Fibbonacci();
            f1.start();
            divbyThree d1 = new divbyThree();
            d1.start();
            Welcome w1 = new Welcome();
            w1.start();
    }
}