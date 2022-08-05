import java.util.Scanner;
import java.lang.String;

public class ContaDigPares
{
    public static void main(String[] args)
    {

        String n,guardar;
        int i,x;
        x=0;
        guardar = "";
        
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext())
        {
            n = in.next();
            for(i = 0 ;i != n.length(); i++)
            {
                if(n.charAt(i)%2==0)
                {
                    x = x+1;
                }
            }
            guardar = guardar + x + "\n";
            x=0;
        }
        System.out.print(guardar);
    }
}
