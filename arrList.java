import java.util.ArrayList;//contributed by harish rane
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*Create a Java application using collection framework to perform following 
operations on ArrayList.
a. Create an ArrayList of integer numbers.
b. Add element at specific position in ArrayList.
c. Remove element from specific position ArrayList
d. Reverse elements in ArrayList.
e. Sort the elements of ArrayList.
*/
public class arrList//contributed by harish rane
 {
    public static void main(String args[])
    {//contributed by harish rane
            ArrayList <Integer> a = new ArrayList();
            a.add(11);
            a.add(22);//contributed by harish rane
            System.out.println("Array list :"+a);
            Scanner sc = new Scanner(System.in);//contributed by harish rane
            System.out.println("Enter the element to insert(int)");
            int ele = sc.nextInt();
            System.out.println("Enter the position to inserrt");
            int pos = sc.nextInt();
            a.add(pos,ele);//contributed by harish rane
            System.out.println("Array list : after adding ele"+a);
            System.out.println("\nEnter the position to remove");
            pos = sc.nextInt();
            a.remove(pos);//contributed by harish rane
            System.out.println("Array list :after removing"+a);

            Collections.reverse(a);//contributed by harish rane
//contributed by harish rane
            System.out.println("Array list : after reversing"+a);
            Collections.sort(a);//contributed by harish rane
            System.out.println("Array list :after sorting"+a);
    }
    
}
