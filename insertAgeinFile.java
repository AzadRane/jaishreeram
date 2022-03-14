/*Create a program to accept senior citizen name and age store the content in 
text file; throw Invalid Age Exception if age is below 60.*/
import java.io.*;

import javax.net.ssl.ExtendedSSLSession;
class age extends Exception
{
    public age(String e)
    {
        super(e);
    }
}
class abc
{
    String name;
    int age;
    public abc()
    {   try 
        {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               File f = new File("age.txt");
               FileWriter fw = new FileWriter(f);
               System.out.println("Emter the name");
               name=br.readLine();
               System.out.println("Enter the age");
               age = Integer.parseInt(br.readLine());
               if(age>=60)
               {
                   fw.write(name);
                   fw.write(String.valueOf(age));
                   fw.close();
               }
               else
               {
                   throw new age("INVALID AGE EXCEPTION");
               }
        }
        catch(age e) 
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class insertAgeinFile
{
    public static void main(String args[])
    {
        abc a = new abc();
    }
}