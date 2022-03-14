import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*Create a Java application using collection framework to perform following 
operation on LinkedList.
a. Create LinkedList of String elements.
b. Iterate through the LinkedList.
c. Insert element at specified position.
d. Remove element from specified position*/

public class linkedList
{
    public static void main(String args[])throws Exception
    {
        LinkedList<String> l1 =new LinkedList();
        l1.add("haarish");
        l1.add("manish");
        l1.add("umya");
        l1.add("deepesh");

        Iterator ie = l1.iterator();

        System.out.println("Linked list:");

        while(ie.hasNext())
        {
            System.out.print(ie.next()+"->");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the pos to be insreted");
        int pos = sc.nextInt();
        System.out.println("Enter the srting to be inserted");
        String ele = sc.next();
        l1.add(pos,ele);
        System.out.println("Linked list: after ading ");

       while(ie.hasNext())
        {
            System.out.print(ie.next());
        }
        /* 
        System.out.println("\nEnter the pos to be deleted");
         pos = sc.nextInt();

        l1.remove(pos);
        System.out.println("Linked list: after removing");

        while(ie.hasNext())
        {
            System.out.print(ie.next()+"->");
        }
        */
    }
}