import java.util.Scanner;

public class Jokenpo
{
  public static void main(String[] arguments)
  {
    int n,i;
    String jogador1,jogador2,resultado;


    Scanner scan = new Scanner(System.in);

    n = scan.nextInt();
    resultado ="";
    for(i=0;i<n;i++)
    {
        jogador1 =scan.next();
        jogador2 =scan.next();
        if(jogador1.equals("pedra")&&jogador2.equals("pedra")) resultado = resultado + "empate\n";
        else if(jogador1.equals("pedra")&&jogador2.equals("papel")) resultado =resultado + "jogador 2\n";
        else if(jogador1.equals("pedra")&&jogador2.equals("tesoura")) resultado =resultado + "jogador 1\n";
        else if(jogador1.equals("papel")&&jogador2.equals("pedra")) resultado = resultado +"jogador 1\n";
        else if(jogador1.equals("papel")&&jogador2.equals("papel")) resultado = resultado +"empate\n";
        else if(jogador1.equals("papel")&&jogador2.equals("tesoura")) resultado =resultado + "jogador 2\n";
        else if(jogador1.equals("tesoura")&&jogador2.equals("pedra")) resultado =resultado + "jogador 2\n";
        else if(jogador1.equals("tesoura")&&jogador2.equals("papel")) resultado = resultado +"jogador 1\n";
        else if(jogador1.equals("tesoura")&&jogador2.equals("tesoura")) resultado = resultado +"empate\n";
    }
    System.out.print(resultado);
  }
}
