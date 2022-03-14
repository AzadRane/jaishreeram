import java.util.Scanner;

/*Create a class Number with an array of 20 integers in it as data member. Add 
two searching methods in the Number class to perform operations on an 
integer array. 
void linear(): To implement linear search.
void binary(): To implement binary search.*/
import java.util.*;
import java.io.*;

class NumberDemo
{
    
    //Scanner sc = new Scanner(System.in);
    
    int arr [] = {10,90,20,50,60,33,1};
    Scanner sc  = new Scanner(System.in);
    void linear()
    {   
        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                System.out.println(arr[i]+"Element found at "+i+" position");
                break;
            }
        }
            
    }

    void binary()
    {   
        Arrays.sort(arr);
        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();
        int low = 0,high=arr.length-1;
        int mid ;
        while(low <= high)
        {
            mid = (low + high)/2;
            if(ele == arr[mid])
            {   System.out.println("Element found at "+mid);
                break;}
            else if(ele<arr[mid])
              {      high = mid-1;}
            else if(ele>arr[mid])
                {    low = mid+1;
                }
        }
    }

    
}

public class search 
{
    public static void main(String args[])
    {   
        NumberDemo n1  = new NumberDemo();
        n1.linear();
        n1.binary();
        //System.out.println("hii");
    }
}