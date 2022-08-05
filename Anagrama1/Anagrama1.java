import java.util.Scanner;
public class Anagrama1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n;
        String p1,inverso,palavras,r;
        p1 = scan.next();
        n = scan.nextInt();
        r = "";

        for(int i = 0; i<n; i++)
        {
            inverso ="";
            palavras= scan.next();
            for(int j = palavras.length()-1; j>=0; j--)
            {
                inverso = inverso + palavras.charAt(j);
            }
            if(p1.equals(inverso))
            {
                r="sim";
                break;
            }
            else
            {
                r="nao";
            }
        }
        System.out.println(r);
    }
}
