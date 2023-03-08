//Faça um algoritmo que receba dois números e ao final mostre a soma, 
// subtração, multiplicação e a divisão dos dois números lidos;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        float num1 = 0;
        float num2 = 0;
        float resultado = 0;

        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite o primeiro valor: ");
            num1 = leitura.nextFloat();
            System.out.println("Digite o segundo valor: ");
            num2 = leitura.nextFloat();
        }

        System.out.println("O RESULTADO DA CONTA " + num1 + " + " + num2 + ": ");
        resultado = num1 + num2;
        System.out.println("SOMA: " + resultado);
        resultado = num1 - num2;
        System.out.println("SUBSTRAÇÃO: " + resultado);
        resultado = num1 * num2;
        System.out.println("MULTIPLICAÇÃO: " + resultado);
        resultado = num1 / num2;
        System.out.println("DIVISÃO: " + resultado);

        // Posso passar todos esses calculos pra uma outra classe, sem ter que escrever todas as contas
        // nessa tela
    }   
}
