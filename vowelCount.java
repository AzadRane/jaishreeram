import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;
/*Create a java program that read name of a file, check whether file exists or 
not. If exist then count the number of vowels from that file and display back 
to the user.*/
public class vowelCount
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name");
        String fname = br.readLine();
        char c;
        int n;
        int cnt=0;
        FileInputStream fis = new FileInputStream(fname);
        File f = new File(fname);
        if(f.exists())
        {   
            n=fis.available();
            for(int i=0;i<n;i++)
            {
                c=(char)fis.read();
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
                 cnt++;
            }

            System.out.println("Count of vowels :"+cnt);

        }
        else
        {
            System.out.println("File not found");
        }
    }
}