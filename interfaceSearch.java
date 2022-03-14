/*Create an Interface SearchInt with two methods in it
void linearSearch(): Searches given element using Linear Search
void binarySearch():Searches given element using Binary Search
Implement a class Search from SearchInt to search the given element either 
using Linear Search or using Binary Search.*/

import java.util.*;



interface SearchInt
{
    int linearSearch(int x);
    void binarySearch();
}

class searching implements SearchInt
{
    public int arr[],size,ele,i;
    Scanner s = new Scanner(System.in);

    public void insert()
    {
        System.out.println("How many element you want to insert : ");
        size = s.nextInt();

        arr = new int[size];

        for(i=0;i<size;i++)
        {
            arr[i] = s.nextInt();
        }
    }

    public int linearSearch(int x)
    {
         for(i=0;i<size;i++)
         {
             if(arr[i]==x)
             {
                 i++;
                 return i;
             }
         }
         return -1;
    }

    public void binarySearch()
    {
        System.out.println("Enter element to search :");
        ele=s.nextInt();

        //to sort the elements to perform binary search 
        int counter =1;
        while(counter<size)
        {
             for(i=0;i<size-counter;i++)
             {
                 if(arr[i] > arr[i+1])
                 {
                     int swap = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = swap;
                 }
             }
             counter++;
        }

        //displaying array after sorting
        System.out.println("Elements after sorting : ");
        display();

        //algorithm for binary search
        int first=0, last=size-1,mid;
        
        while(first<=last)
        {
            mid = (first+last)/2;
            if(arr[mid] == ele)
            {
                mid++;
                System.out.println(ele + " is at " + mid + " position.");
                break;
            }
            else if(arr[mid] > ele)
            {
                last = mid-1;
            }
            else if(arr[mid] < ele)
            {
                first = mid+1;
            }
        }
        if(first>last)
        {
            System.out.println("Element is not found.");
        }
    }

    public void display()
    {
        for(i=0;i<size;i++)
        {
            System.out.print("\t" + arr[i]);
        }
        System.out.println(" ");
    }
}

public class interfaceSearch {
    public static void main(String[] args) {
        int choice,element;
        Scanner sc = new Scanner(System.in);
        searching s1 = new searching();

        while(true)
        {
            System.out.println("1.Insert \n2.Display \n3.Linear Search \n4.Binary Search \nExit");
            System.out.println("Enter any choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : s1.insert();break;
                case 2 : s1.display();break;
                case 3 : System.out.println("Enter element to search :");
                         element=sc.nextInt();
                         if(s1.linearSearch(element)==-1)
                         {
                             System.out.println("element not found.");
                         }
                         else 
                         {
                             System.out.println("element found at position " + s1.linearSearch(element));
                         }
                        break;
                case 4 : s1.binarySearch();break;
                case 5 :  int e;
                          System.out.println("Are you sure want to exit ?");
                          System.out.println(" 1.yes \n 2.no");
                          e = sc.nextInt();
                          if(e==1){
                              System.out.println("exit...");
                              System.exit(0);
                          }
                          else{
                              break;
                          }
            }
            sc.close();
        }
    }
}
