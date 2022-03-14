/*. Create a java program that reads a two file names through command line read 
the content from first file and writes this in to second file by converting in 
upper case*/
import java.io.*;
import java.util.Scanner;

public class twoupperFile 
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //args[0] = br.readLine();
       // args[1] = br.readLine();
      //  String file1 = args[0];
     //   String file2 = args[1];

        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);

        File f1 = new File(args[0]);
        int size;
        char c;
        if(f1.exists())
        {   
            size = fis.available();
            for(int i=0;i<size;i++)
            {
                c=(char)fis.read();
                c=Character.toUpperCase(c);
                fos.write(c);
            }

        }
        else
        {
            System.out.println("File does not exits");
        }
    }

}