/*Create a class Matrix that contains one two dimensional int array and Size of 
matrix i.e. rows & columns as data member. The class also contains following 
member functions.
getElement () // Accepts elements from the user.
Matrix add (Matrix M2) // It adds two Matrix objects 
Matrix mult (Matrix M2) // It multiply two Matrix Objects
void display() // Displays the elements of Matrix*/
//coded by harish rane
import java.io.*;
import java.util.*;
//coded by harish rane
class Matrix
{   int r,c;
    int arr [][] ;
    Scanner sc = new Scanner(System.in);
    void getElement()
    {//coded by harish rane
        System.out.println("Enter the no. of row");
        r = sc.nextInt();
        System.out.println("Enter the no. of columns");
        c = sc.nextInt();
        arr = new int[r][c];

        for(int i  = 0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("enter the element");
                arr[i][j] = sc.nextInt();
            }
        }
    }
//coded by harish rane
    void display()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    Matrix add(Matrix m1,Matrix m2)//coded by harish rane
    {
        Matrix m3 = new Matrix();

        for(int i=0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                m3.arr[i][j] = m1.arr[i][j] + m2.arr[i][j];
            }
        }//coded by harish rane
        
        return m3;
    }
    
    Matrix mult(Matrix m1,Matrix m2)
    {
        Matrix m3 = new Matrix();//coded by harish rane
         for(int i = 0;i<r;i++)
         {
             for(int j=0;i<c;j++)//coded by harish rane
             {
                 for(int k = 0;k<c;k++)
                 {//coded by harish rane
                     m3.arr[i][j]=m1.arr[i][k]+m2.arr[k][j];
                 }
             }
         }
        return m3;//coded by harish rane
    }

}//coded by harish rane

public class MatrixDemo
{
    public static void main(String args [])
    {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();//coded by harish rane
        Matrix op  = new Matrix();
        
        m1.getElement();
        m2.getElement();
       // m1.display();
       // m2.display();
//coded by harish rane
        op = op.add(m1,m2);
        op.display();
//coded by harish rane
        op = op.mult(m1, m2);
        op.display();
//coded by harish rane
        
    }
}