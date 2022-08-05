import java.util.Scanner;
public class Will
{
    public static void main(String[] args)
    {
        String s,r;
        int n,lamp;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            s = scan.next();
            n = scan.nextInt();

            for(int i = 0; i<n; i++)
            {
                lamp = scan.nextInt();
                System.out.print(s.charAt(lamp-1));
            }
            System.out.println();
        }
    }
}