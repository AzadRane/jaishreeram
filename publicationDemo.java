/*Imagine a publishing company that markets both books and Video-Cassettes 
versions of its works. Create a class publication that stores the title (a string) 
and price (a float) of publication. From this class derive two classes: Book, 
which adds a page count (integer) and Tape, which add a playing time in 
minutes (float). Each of these three classes should have a getdata ( ) and 
putdata () functions. Write a Java program to test these classes.*/
import java.util.*;
class Company
{
    String title;
    float price;
    
    Scanner sc = new Scanner(System.in);

    void putdata()
    {

        

        System.out.println("Enter the title");
        title = sc.nextLine();

        System.out.println("Enter the price");
        price = sc.nextFloat();
    }

    void getdata()
    {
        System.out.println("Title = "+title);

        System.out.println("Price  = "+price);
    }

}

class Book extends Company
{
    int pgcnt;

    public void disp()
    {
        System.out.println("Enter the book details");
    }
    

    public void putdata()
    {
        super.putdata();
        System.out.println("enter the page count ");
        pgcnt = sc.nextInt();
    }

    public void getdata()
    {
        super.getdata();

        System.out.println("Page Count ="+pgcnt);
    }
}

class Tape extends Company
{
    float ptime;
    
    public void show()
    {
        System.out.println("Enter the tape details");
    }

    public void putdata()
    {
        super.putdata();

        System.out.println("Enter the playing time");
        ptime  = sc.nextFloat();
    }

    public void getdata()
    {
        super.getdata();

        System.out.println("Playing time :"+ptime);
    }
}

public class publicationDemo
{
    public static void main(String args[])
    {
        Book b1 = new Book();
        b1.disp();
        b1.putdata();
        b1.getdata();

        Tape t1 = new Tape();
        t1.show();
        t1.putdata();
        t1.getdata();
    }
}