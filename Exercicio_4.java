
import java.util.Scanner;

import javax.xml.validation.Validator;
public class Exercicio_4 {

    public static void main(String[] args){

        float capital;
        int prazo;
        float tx_juros;
        double montante;
    

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor inicial para aplicação:");
        capital = scanner.nextFloat();

        System.out.println("Insira o prazo de aplicação:");
        prazo = scanner.nextInt();

        System.out.println("Insira a taxa de juros mensal:");
        tx_juros = scanner.nextFloat();

        tx_juros = tx_juros/100;

       // montante = capital*(Math.pow((1+tx_juros),prazo));
        montante = capital * Math.pow((1 + tx_juros), prazo);
                 
        System.out.println("O montante a ser recebido é R$:" + montante);

        System.out.println("");

        montante = (montante - capital);

        System.out.println("O total de juros é R$:" + montante);
    
        scanner.close();

    }

}