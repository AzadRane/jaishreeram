import javax.naming.InitialContext;

/*4. Create a Java program that create and run the following threads:
To print letter ‘A’ 50 times.
To print letter ‘B’ 100 times.
To print integers 1 60 times.*/

class A implements Runnable
{
    public void run()
    {
        int i=0;
        while(i!=50)
        {
            System.out.println("A");
            i=i+1;
        }
    }
}


class B implements Runnable
{
    public void run()
    {
        int i=0;
        while(i!=100)
        {
            System.out.println("B");
            i=i+1;
        }
    }
}
class int1 implements Runnable
{
    public void run()
    {
        int i=0,c=1;
        while(i!=60)
        {
            System.out.println(c);
            i=i+1;
        }
    }
}

public class abiTimes
{
    public static void main(String args[])
    {
        A a1 = new A();
        a1.run();

        B b1 = new B();
        b1.run();

        int1 i = new int1();
        i.run();
    }
}