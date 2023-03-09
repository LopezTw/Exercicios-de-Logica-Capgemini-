// Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        int num1 = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um valor:");
        num1 = leitor.nextInt();

        if(num1 > 100 && num1 < 200){
            System.out.println("O numero " + num1 + " está no intervalo de 100 e 200");
        }  else{
            System.out.println("O numero está fora do intervalo de 100 e 200");
        }

        // Código simples, poderia incrementar com validação de entrada, pra caso fosse
        // inserido uma letra informa-se que o numero é invalido.
    }
}
