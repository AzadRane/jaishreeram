/*Create a class Employee with following members
Data Members: - Employee Number, Name, Designation, Basic Salary
Member Function:-
To accept the information of Employee
To calculate Net Salary with proper DA, HRA, PF, and IT.
To display the information of all Employee
Create a Java program to accept details of 10 employees from user and 
calculate salary sheet and display back to user.*/
import java.util.*;

class Employe
{
    int empid;
    String ename,des;
    double basicsal,da,hra,pf,gs,it,net;
    Scanner sc = new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the emp name");
        ename = sc.next();
        System.out.println("Enter the emp id");
        empid = sc.nextInt();
        System.out.println("Enter the designation");
        des =  sc.next();
        System.out.println("Enter the salary");
        basicsal = sc.nextDouble();

    }

    double calNetSal()
    {
        da = basicsal*0.65;
	
    	hra= basicsal *0.25;
	    
        gs= basicsal + hra+ da;
    
        it = gs*0.1;
	
	    pf = gs*0.12;
	    
        net= gs - (pf + it);

        return net;
    }

    void display()
    {
        System.out.println("emp name :"+ename);
        System.out.println("emp id:"+empid);
        System.out.println("emp designation :"+des);
        System.out.println("Basic Salaray of employee is " +basicsal);
    	System.out.println("DA of employee is " + da);
	    System.out.println(" HRA of employee is " + hra);
	    System.out.println(" IT of employee is " + it);
	    System.out.println(" PF of employee is " +pf);
	    System.out.println(" NET salary of employee is " + net);

        System.out.println("emp net sal :"+calNetSal());


    }
}

public class dahraEmp
{
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
        { 
               Employe e = new  Employe();
               e.getData();
               e.calNetSal();
               e.display();
        }
    }
}