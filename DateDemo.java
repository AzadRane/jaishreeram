/* Create a class Date with data members day, month and year. Add appropriate 
methods in it to accept date and display date. By accepting current date and 
birth date of user, find the current age and display it back to user in the form 
of yyyy-mm-dd.*/

import java.io.*;
import java.util.*;

class Datee
{   
    int day,month,year,age;
    String cdate , bdate;
    Scanner sc = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter the current date");
        cdate = sc.next();
        System.out.println("Enter the birth date");
        bdate = sc.next();
    }

    void display()
    {
        {
            System.out.println("the current date is "+cdate);
    
            System.out.println(" the birth date is "+bdate);

            
           
        }
    
    }

    void calcAge()
    {   
        age = Integer.parseInt(cdate.substring(0, 4))-Integer.parseInt(bdate.substring(0,4));

        System.out.println("the age is "+age);
    }

}

public class DateDemo
{
    public static void main(String args [])
    {
        Datee d1 = new Datee();

        d1.accept();
     
        d1.display();

        d1.calcAge();
    }
}