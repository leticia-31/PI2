import java.util.Scanner;
public class ComprimentoDaString
{
    public static void main(String[] args)
    {
        String s,r;
    
        Scanner in = new Scanner(System.in);
        r="";
        while(in.hasNext())
        {
            s = in.next();
            
            r = r + s.length() + "\n";
        }
        System.out.print(r);
    }
}