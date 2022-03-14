/* Create a class Student with following data members
Date Members: Roll No, Name, Class, Marks of 5 Subjects
Member functions:
acceptDetails(): To accept student details from user.
displayDetails(): To show student details to user.
calculateResult(): To calculate result of student.
Create a Java program to accept information of 10 students, calculate total, 
percentage and display complete result back to user.*/

import java.util.*;
import java.io.*;

class Student
{
	private int roll;
        private String name;
        private String clas;
        private int m1;
        private int m2;
        private int m3;
	private int m4;
	private int m5;
        private int total;
        private double average;

        Student()
	{
		roll = 0;
		name = "abc";
        	clas = "a";
        	m1 = 0;
        	m2 = 0;
        	m3 = 0;
		m4 = 0;
		m5 = 0;
	}

	public void acceptDetails()
	{
        	Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Roll NO.: ");
        	roll = in.nextInt();
        	System.out.print("Enter name: ");
		in.nextLine();
        	name = in.nextLine();
        	System.out.print("Enter class: ");
        	clas = in.nextLine();
        	System.out.print("Enter Subject 1 Marks: ");
        	m1 = in.nextInt();
        	System.out.print("Enter Subject 2 Marks: ");
        	m2 = in.nextInt();
        	System.out.print("Enter Subject 3 Marks: ");
        	m3 = in.nextInt();
		System.out.print("Enter Subject 4 Marks: ");
        	m4 = in.nextInt();
		System.out.print("Enter Subject 5 Marks: ");
        	m5 = in.nextInt();
	}

	public void calculateResult()
	{
        	total = m1 + m2 + m3 + m4 + m5;
        	average = total / 5.0;
	}

	public void displayDetails()
	{
		System.out.println("\n Result of Student: ");
		System.out.println("Roll no. : " + roll);
        	System.out.println("Name: " + name);
        	System.out.println("class: " + clas);
        	System.out.println("Subject 1 Marks: " + m1);
        	System.out.println("Subject 2 Marks: " + m2);
        	System.out.println("Subject 3 Marks: " + m3);
		System.out.println("Subject 4 Marks: " + m4);
		System.out.println("Subject 5 Marks: " + m5);
        	System.out.println("Total Marks: " + total);
        	System.out.println("Average Marks: " + average);
		System.out.println();
        }
}
class sMarks
{
	public static void main(String args[])throws IOException
	{
		int i;
		Student s[] = new Student[10];

		for(i = 0; i < s.length; i++)
		{
			System.out.println("Enter Details of "+(i+1)+"th student:");
			s[i] = new Student();
        		s[i].acceptDetails();
        		s[i].calculateResult();
        		s[i].displayDetails();
		}
    	}
}