//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
//“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

// Só irei testar com 4 pessoas.

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);
        int idade = 0;

        for(int i = 1; i <= 4; i++){
         //   System.out.println("================ "); // melhorar legibilidade no console
            System.out.println("Informe a idade: ");
            idade = leitor.nextInt();

            if(idade > 18){
         //       System.out.println("================ "); // melhorar legibilidade no console
                System.out.println(idade + " é maior de Idade !");
            } else {
         //        System.out.println("================ "); // melhorar legibilidade no console
                System.out.println(idade + " é menor de Idade !");
            }

        }
        leitor.close();
    }
}
