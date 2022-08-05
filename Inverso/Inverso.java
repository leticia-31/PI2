import java.util.Scanner;
public class Inverso
{
    public static void main(String[] args)
    {
        String s,r;
        int tamanho;

        Scanner in = new Scanner(System.in);

        r="";
        while(in.hasNext())
        {
            s = in.next();
            tamanho = s.length();

            for(int i=tamanho-1; i>=0; i=i-1)
            {
                r = r+s.charAt(i);
            }

            r = r +"\n";
        }
        System.out.print(r);
    }
}
