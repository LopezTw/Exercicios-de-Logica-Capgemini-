//Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
//Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
//Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
//outros dois lados.

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0; 

        System.out.println("Informe o primeiro número:");
        num1 = leitor.nextInt();
        System.out.println("Informe o segundo número:");
        num2 = leitor.nextInt();
        System.out.println("Informe o terceiro número:");
        num3 = leitor.nextInt();

        if(num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1){
            if(num1 == num2 && num3 != num2 && num3 != num1) // Isósceles
                System.out.println("Triângulo Isósceles!");
            else if(num1 == num2 && num1 == num3 && num2 == num3) { 
                System.out.println("Triângulo Equilátero!");
            } else {
                System.out.println("Triângulo Escaleno!");
            }
        } else {
            System.out.println("Esses valores não forma um Triângulo!");
        }
        
    }
}
