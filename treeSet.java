import java.util.Scanner;
import java.util.TreeSet;

/*Create a Java application using collection framework to perform following 
operations on TreeSet.
a. Create TreeSet with String elements.
b. Traverse through TreeSet.
c. Insert the elements in TreeSet.
d. Remove the specified element from TreeSet.*/

public class treeSet 
{//contributed by harish rane
    public static void main(String args[])
    {
        TreeSet <String> t = new TreeSet(); 
        t.add("harish");
        t.add("sandeep");
        t.add("rane");
        System.out.println("TRREE SET origbnal");
        for(String ss:t)
        {//contributed by harish rane
            System.out.println(ss);
        }

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the element to insert(string)");
        String ele = sc.next();

        t.add(ele);
        System.out.println("TRREE SET after add");
        for(String ss:t)
        {
            System.out.println(ss);//contributed by harish rane
        }
        

        System.out.println("Enter the element to remove");
        ele = sc.next();

        t.remove(ele);

        System.out.println("TRREE SET after remove");
        for(String ss:t)//contributed by harish rane
        {
            System.out.println(ss);
        }
    }
}