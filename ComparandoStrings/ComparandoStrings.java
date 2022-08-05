import java.util.Scanner;
public class ComparandoStrings
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
            if(s1.equals(s2))
            {
                r = r + "iguais\n";
            }
            else
            {
                r = r + "diferentes\n";
            }
        }
        System.out.print(r);
    }
}
