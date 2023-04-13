import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args){
   
    Scanner scanner = new Scanner (System.in);


    System.out.printf(" Insira a quantidade de motos: ");
    int quantMotos = scanner.nextInt();

    System.out.printf(" Insira a quantidade de carros: ");
    int quantCarros = scanner.nextInt();

    int quantPneus = (quantCarros * 4) + (quantMotos * 2);
    System.out.println(" No estacionamento há: " + quantCarros + " carros e " + quantMotos + " motos.");
    System.out.println(" A quantidade total de rodas é " + quantPneus);

    scanner.close();
    }
}