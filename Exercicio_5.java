import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Inisira as horas trabalhadas durante o mes:");
            float HorasTotais = scanner.nextFloat();

        System.out.println("Inisira o valor da hora:");
            float ValorHora = scanner.nextFloat();

        System.out.println("Inisira o valor do salário familia:");
            float SalarioFamilia = scanner.nextFloat();

        System.out.println("Inisira a quantidade de filhos menores de 14 anos:");
            float FilhosMenores = scanner.nextFloat();

            float SalarioTotal = (HorasTotais * ValorHora);
                  SalarioFamilia = (SalarioFamilia * FilhosMenores);
                  SalarioTotal = (SalarioFamilia + SalarioTotal);

        System.out.println("O valor do salário bruto é:" + SalarioTotal);

            scanner.close();












    }
    
}
