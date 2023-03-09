// Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;

// Eu não precisava usar WHILE, mas usei a fim de tornar mais útil

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        int f = 0;
        int c = 0;
        char continuar = 's';

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe a temperatura em Celsius: ");

            while(continuar == 'S' || continuar == 's'){

                c = leitor.nextInt();
                f = ((9 * c) + 160) / 5;

                System.out.println("A temperatura em Fahrenheit é: " + f);

                System.out.println("Deseja fazer mais uma consulta? S/N");
                continuar = leitor.next().charAt(0);

                System.out.println("Informe a temperatura em Celsius: ");
            }

        }
    


    }
}
