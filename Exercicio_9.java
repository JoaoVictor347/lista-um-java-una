import java.util.Scanner;

public class Exercicio_9 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de segundos:");
        int segundos = scanner.nextInt();

        int horas = (segundos / 3600); 
        int minutos = (segundos/ 60);
        segundos = (segundos % 60);

        System.out.println("A quantidade de horas são: " + horas + " H");
        System.out.println("A quantidade de minutos são: " + minutos);
        System.out.println("A quantidade de segundos são: " + segundos);

        
        //System.out.printf("Resultado: %d horas, %d minutos e %d segundos", horas, minutos, segundos);
        scanner.close();

    }
}
