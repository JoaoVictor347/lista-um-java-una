import java.util.Scanner;

public class Exercicio_7 {
    
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do salário fixo do vendendor:");
        float salarioFixo = scanner.nextFloat();

        System.out.println("Insira o valor total das vendas:");
        float valorVendas = scanner.nextFloat();

        System.out.println("Insira o valor em percentual que o vendedor ganha nas vendas:");
        float percentualGanho = scanner.nextFloat();

        float calculoGanhos = (valorVendas * percentualGanho) /100;


        salarioFixo = (salarioFixo + calculoGanhos);

        System.out.println("O valor total do salário com as comissões é R$: " + salarioFixo);

        scanner.close();










    }



}
