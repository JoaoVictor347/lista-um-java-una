import java.util.Scanner;

public class Exercicio_2{

    public static void main(String[] args){

     Scanner scanner = new Scanner (System.in);

     float valor;
     float valor_10;


     System.out.println("Insira o valor do produto:");
     valor = scanner.nextFloat();

     valor_10 = (valor*10/100);
     

     System.out.println("O valor do produto acrescido 10% é R$" + (valor + valor_10));

     scanner.close();




    }



}