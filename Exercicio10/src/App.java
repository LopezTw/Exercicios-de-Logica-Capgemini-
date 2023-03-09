//A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um 
//aloritmo que receba um valor de uma compra e mostre o valor das prestações;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        int prestacao = 5;
        float valor = 0.0f;
        char continuar = 's';

        Scanner leitor = new Scanner(System.in);

        while(continuar == 's' || continuar == 'S'){
            
            System.out.println("Informe o valor do produto: ");
            valor = leitor.nextFloat();

            valor = valor / prestacao;
            System.out.println("O valor das prestações é de: R$" + valor);

            System.out.println("Deseja fazer mais uma consulta? S/N");
            continuar = leitor.next().charAt(0);


        }

    }    



}
