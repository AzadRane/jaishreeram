import java.io.*;

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