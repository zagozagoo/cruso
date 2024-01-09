import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int primeiroValor, segundoValor;
    primeiroValor = sc.nextInt();
    segundoValor =  sc.nextInt();
    soma = primeiroValor + segundoValor;
    
    System.out.println("A soma eh: " + soma);

    sc.close();
  }
}
