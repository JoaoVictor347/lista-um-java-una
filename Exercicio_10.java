import java.util.Scanner;

public class ExercicioDez {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritmo Calculo Média Aritmética");

        System.out.println("\nInforme o primeiro número:");
        double numeroUm = scanner.nextDouble();

        System.out.println("\nInforme o segundo número:");
        double numeroDois = scanner.nextDouble();

        System.out.println("\nInforme o primeiro número: ");
        double numeroTres = scanner.nextDouble();

        double mediaAritmetica = (numeroUm + numeroDois + numeroTres) /3;

        double mediaHarmonica = 3/((1/numeroUm) + (1/numeroDois) + (1/numeroTres));

        double mediaGeometrica = Math.cbrt(numeroUm * numeroDois * numeroTres);

        System.out.println("A média aritmética é: " + mediaAritmetica);
        System.out.println("A média Harmônica é: " + mediaHarmonica);
        System.out.println("A média Geométrica é: " + mediaGeometrica);

        scanner.close();

    }
}