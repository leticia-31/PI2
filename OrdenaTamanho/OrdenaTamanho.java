import java.util.Scanner;
public class OrdenaTamanho
{
    public static void main(String[] args)
    {
        int n,posicao_maior;
        String aux;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        String ordenar[] = new String[n];

        int tamanho[] = new int[n];

        for(int i = 0; i< ordenar.length; i++)
        {
            ordenar[i]= in.next();
        }
        for(int i = 0; i<ordenar.length-1;i++)
        {
            for(int j = 0; j<ordenar.length-1-i;j++)
            {
                if(ordenar[j].length() < ordenar[j+1].length())
                {
                    aux = ordenar[j];
                    ordenar[j] = ordenar[j+1];
                    ordenar[j+1]=aux;
                }
            }
        }
        for(int i=0; i<ordenar.length;i++)
        {
            System.out.println(ordenar[i]);
        }
    }
}
