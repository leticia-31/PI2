import java.util.Scanner;
import java.lang.String;
public class MaiorPalavra
{
    public static void main(String[] args)
    {
        String s,r;
        int tamanho,a;
        Scanner in = new Scanner(System.in);
        r="";
        a=0;
        if(in.hasNext())
        {    while(in.hasNext())
            {
                s = in.next();
                tamanho = s.length();
                if(tamanho>a)
                {
                    a=tamanho;
                    r=s;
                }
            }
            System.out.println("A maior palavra informada foi "+r);
        }
        else
        {
            System.out.println("Nenhuma palavra foi informada");
        }
    }
}