//Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
//imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
//maior, e uma mensagem que são diferentes;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Insira o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Insira o segundo número: ");
        num2 = leitor.nextInt();

        if(num1 == num2){
            System.out.println("Os números inseridos são IGUAIS !");
        } else if(num1 > num2){
            System.out.println("Os números inseridos são Diferentes e " + num1 + " é maior que " + num2);
        } else {
            System.out.println("Os números inseridos são Diferentes e " + num2 + " é maior que " + num1);
        }
        leitor.close();
    }
}
