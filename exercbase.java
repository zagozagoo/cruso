import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    double largura, comprimento, metroQuadrado, area, preco;
    largura = sc.nextDouble();
    comprimento =  sc.nextDouble();
    metroQuadrado =  sc.nextDouble();
    area = largura * comprimento;
    preco = area * metroQuadrado;
    
    System.out.printf("A area eh: %.2f%n", area);
    System.out.printf("O preco eh: %.2f%n", preco);

    sc.close();
  }
}
