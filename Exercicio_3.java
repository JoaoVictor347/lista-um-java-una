import java.util.Scanner;

public class Exercicio_3{
  public static void main(String[] args) {
  
    double graus;
   
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o valor em Fahrenheit:");
    graus = scanner.nextDouble(); 

    graus = ((graus - 32)/1.8);

    System.out.println("O valor em graus centigrados é:" + graus);
   
    scanner.close();

}




}