import java.util.Scanner;


public class QuadradoDaMetade
{
    public static void main(String[] args)
    {

        int n,x,h,y;
        String d;
        d="";
        n=0;

        Scanner in = new Scanner(System.in);

        while(in.hasNext())
        {
            n = in.nextInt();
            h = n/100; // 2 primeiros digitos
            x = n%100; //2 ultimos digitos
            y = (x+h)*(x+h);
            if(y==n)
            {
                d = d + "OK\n";
            }
            else
            {
                d = d + "NOK\n";
            }
        }
        System.out.print(d);
    }
}
