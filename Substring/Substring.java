import java.util.Scanner;
public class Substring
{
    public static void main(String[] args)
    {
        String s1,r;
        int p;
        Scanner in = new Scanner(System.in);
        r="";
        while(in.hasNext())
        {
            s1 = in.next();
            p = in.nextInt();
            r = r + s1.substring(p) + "\n";
        }
        System.out.print(r);
    }
}