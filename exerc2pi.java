import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double raio, area, pi = 3.14159;
    
    raio = sc.nextDouble();
    area = pi * R * R;

    System.out.printf("A area eh: %.4f%n", area);

    sc.close();
  }
}
