import java.util.Scanner;
public class CaractereNaPosicao
{
    public static void main(String[] args)
    {
        String s,r;
        int p;
        Scanner in = new Scanner(System.in);
        r="";
        while(in.hasNext())
        {
            s = in.next();
            p = in.nextInt();
            r = r + s.charAt(p) + "\n";
        }
        System.out.print(r);
    }
}