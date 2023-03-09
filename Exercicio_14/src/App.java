// Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
        int num1 = 0;
        int num2 = 0;


        Scanner leitor = new Scanner(System.in);
        
        /**    CÓDIGO SIMPLES
         *  if(num1 > num2){
                System.out.println("O numero " + num1 + " é maior que o numero " + num2);
            } else{
                System.out.println("O numero " + num2 + " é maior que o numero " + num1);
            }
        */

        // CÓDIGO COM VALIDOR DE ENTRADA DE DADO:
        System.out.println("Informa o primeiro numero: ");
        if(leitor.hasNextInt()){
            num1 = leitor.nextInt();
            System.out.println("Informe o segundo numero: ");
            if(leitor.hasNextInt()){
                num2 = leitor.nextInt();
                if(num1 > num2){
                    System.out.println("O primeiro número: " + num1 + " é maior que o segundo número: " + num2);
                } else if (num2 > num1){
                    System.out.println("O segundo número: " + num2 + " é maior que o primeiro número: " + num1);
                } else {
                    System.out.println("Os dois números são iguais: ");
                }
            } else {
                System.out.println("Número inválido."); 
            }
        } else {
            System.out.println("Número inválido.");
        }

        leitor.close();

        // Posso incrementar com WHILE a fim fazer novas consultas ou voltar ao inicio
        // quando um valor invalido é inserido.

    }
}
