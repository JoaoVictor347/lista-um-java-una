import java.util.Scanner;

public class Exercicio_1{

public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

     float nota1;
     float nota2;
     float media;

     System.out.println("Insira o primeiro número aqui:");
     nota1 = scanner.nextFloat(); 

     System.out.println("Insira o segundo número aqui:");
     nota2 = scanner.nextFloat(); 

     media = (nota1 + nota2) / 2;

     System.out.println("A média aritmética é:"  + media);

      scanner.close();


}

}
