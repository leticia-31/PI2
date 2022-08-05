import java.util.Scanner;

public class Numeros
{
    public static void main(String[] args)
    {
        int n,i,x;
        String a,b,c,d;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        x=0;
        i =1;
        a = "abundante";
        b = "perfeito";
        c = "deficiente";
        d = "";
        while(n>0)
        {
            for(i=1;i<n;i++)
            {
                if(n%i == 0)
                {
                    x = x+i;
                }
            }
        if(x>n)
        {
            d = d + a + "\n";
        }
        else if (x == n)
        {
            d = d + b + "\n";
        }
        else
        {
            d = d + c + "\n";
        }
        i = i+1;
        x = 0;
        n = in.nextInt();

        }
        System.out.print(d);
    }
}