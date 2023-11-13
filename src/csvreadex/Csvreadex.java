package csvreadex;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Csvreadex {
    static FileReader myfile=null;
    static BufferedReader br=null;
    static Scanner sc=null;
    static String line=null;
    public static void main(String[] args) {
        try
        {
            myfile=new FileReader("C:\\Users\\wrl123u\\Desktop\\employee.csv");
            br=new BufferedReader(myfile);
            while((line=br.readLine())!=null)
            {
                sc=new Scanner(line);
                sc.useDelimiter(",");
                while(sc.hasNext())
                {
                    String word=sc.next();
                    System.out.println(word.trim());
                }
                System.out.println();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
