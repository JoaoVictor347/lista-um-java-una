import java.util.Scanner;

    public class Exercicio_6 {

        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Insira o primeiro número:");
            Double numero =  scanner.nextDouble();

            System.out.println("Insira a base desejada para o logaritimo:");
            Double base =  scanner.nextDouble();

            Double resultado =  + Math.log(numero) / Math.log(base);

            System.out.println("O logaritimo desejado é:" + resultado) ;

            scanner.close();



        }
    
}
