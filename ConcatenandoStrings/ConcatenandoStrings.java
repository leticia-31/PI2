import java.util.Scanner;
public class ConcatenandoStrings
{
    public static void main(String[] args)
    {
        String s1,r,s2;

        Scanner in = new Scanner(System.in);
        r="";
        while(in.hasNext())
        {
            s1 = in.next();
            s2 = in.next();
            r = r + s1.concat(s2) + "\n";
        }
        System.out.print(r);
    }
}