/*8. Create a Program to search for given word in the file. Also displays number 
of occurrences of the world*/
import java.io.*;
import java.util.Scanner;

public class fileoccDemo
{
    public static void main(String args[]) throws Exception
    {   Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the File name");
        String fname =  sc.next();
        int size;
        File f1  =new File(fname);
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        System.out.println("Enter the word to be searched");
        String w = sc.next();

        int count = 0;
        String words[]=null;
        while((s=br.readLine())!=null)
        {
            words = s.split(" ");
            for(String word : words)
            {
                if(word.equals(w))
                {
                    count++;
                }
            }
        }
        if(count!=0)  //Check for count not equal to zero
      {
         System.out.println("The given word is present for "+count+ " Times in the file");
      }
      else
      {
         System.out.println("The given word is not present in the file");
      }
      
         fr.close();
    }
}