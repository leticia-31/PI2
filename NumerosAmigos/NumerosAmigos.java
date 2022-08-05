import java.util.Scanner;

public class NumerosAmigos
{
    public static void main(String[] args)
    {
        int n,m,i,x,x1,j;

        Scanner in = new Scanner(System.in);
        
        x1=0;
        x=0;
        String d="";
        while(in.hasNext())
        {
            n = in.nextInt();
        
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    x=x+i;
                }
            }
            m = in.nextInt();
            for(j=1;j<m;j++)
            {
                if(m%j==0)
                {
                    x1 = x1+j;
                }
            }
            if(x==m && x1==n)
            {
                d=d+"amigos\n";
            }
            else
            {
                d=d+"nao amigos\n";
            }
            x=0;
            x1=0;
        }
        System.out.print(d);
    }
}
