import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/*Create a java program that reads two file names from the user. Check whether 
first file exists or not. If exist then read the content of it and write into second 
file by replacing all occurrences of blank space by dollar ($)*/
import java.io.*;
public class dollarFile
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first file name");
        String filen1 = br.readLine();
        System.out.println("Enter the second file name");
        String filen2 = br.readLine();

        FileInputStream fis = new FileInputStream(filen1);
        FileOutputStream fos = new FileOutputStream(filen2);

        File f1 = new File(filen1);
        int size;
        char ch;
        if(f1.exists())
        {
            size = fis.available();
            for(int i=0;i<size;i++)
            {   
                ch = (char) fis.read();
                if(ch==' ')         //space ka logic
                {
                    ch='$';
                    fos.write(ch);
                }
                fos.write(ch);

            }
        }
        else
        {
            System.out.println("File does not exits");
            

        }
        fis.close();
        fos.close();
    }
}