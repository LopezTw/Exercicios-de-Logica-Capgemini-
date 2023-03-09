// Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int num = 0;
        char continuar = 's';

        while(continuar == 's' || continuar == 'S'){

            System.out.println("Informe um numero: ");
            num = leitor.nextInt();

            if(num < 0){
                System.out.println("O numero " + num + " é NEGATIVO!");
            } else if(num == 0) {
                System.out.println("O numero " + num + " é NULO!");
            } else {
                System.out.println("O numero " + num + " é POSITIVO!");
            }

            System.out.println("Deseja continuar? S/N");
            continuar = leitor.next().charAt(0);
        }

    }
}
