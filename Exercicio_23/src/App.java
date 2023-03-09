//Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, 
//menor que 25 ou igual a 40;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Insira um número: ");
        num1 = leitor.nextInt();

        if(num1 == 40){
            System.out.println("O número " + num1 +  " é igual a 40 !");
        } else if (num1 < 20){
            System.out.println("O número " + num1 +  " é menor que 25 !");
        } else if (num1 > 80){
            System.out.println("O número " + num1 +  " é maior que 80 !");
        }

        leitor.close();
    }
}
