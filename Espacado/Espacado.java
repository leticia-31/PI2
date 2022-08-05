import java.util.Scanner;
import java.lang.String;
public class Espacado
{
    public static void main(String[] args)
    {
        String s,r;
        int tamanho,tamanho2;
        
        Scanner in = new Scanner(System.in);
        
        r="";
        while(in.hasNext())
        {
            s = in.next();
            tamanho = s.length();
            for(int i=0; i<tamanho; i++)
            {
                r = r+s.charAt(i)+" ";
            }
            tamanho2 = r.length();
            r = r.substring(0,tamanho2-1) +"\n";
        }
        System.out.print(r);
    }
}