/*. Create a multithreaded application which performs following tasks.
Print first 20 alphabets.
Displays Hello word 15 times
Print last 20 alphabets in reverse order*/
import java.io.*;
import java.lang.*;
public class multiThread2
{
public static void main(String[] args)
{
    Runnable a1 = new alpharev();
Thread t1 = new Thread(a1);
System.out.println("Last 15 alphabets in reverse order");

t1.start();
Runnable p = new print();
Thread t2 = new Thread(p);
System.out.println("\n\nFirst 10 prime numbers:");

t2.start();
Runnable a2 = new alpha();
Thread t3 = new Thread(a2);
System.out.println("First 15 alphabets:");

t3.start();
}
}
class alpharev implements Runnable
{
public void run()
{

for(char i='T';i>='A';i--)

{
System.out.print(""+i);
}
}
}
class print implements Runnable
{
public void run()
{
    for(int i = 0;i<15;i++)
    System.out.println("HELLO");

}
}

class alpha implements Runnable
{
public void run()
{

    for(char i='A';i<='T';i++)
    
    {
    System.out.print(""+i);
    }
}
}