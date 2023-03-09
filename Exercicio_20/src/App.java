//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
//um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
//desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
//sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
//Informar total de carros com ano até 2000 e total geral;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        float valorTotal = 0.0f; // Pagamento total já com Desconto
        float valorDesconto = 0.0f; // O valor do desconto recebido
        float valorCarro = 0.0f; 
        int anoCarro = 0;
        int totalCarros = 0; // Total de carros no geral
        int totalVelho = 0; // Total de carros abaixo dos anos 2000
        float descontoVelho = 0.12f; //Carros até os anos 2000
        float descontoNovo = 0.07f;  //Carros acima dos anos 2000
        
        char continuar = 's';

        while(continuar == 's' || continuar == 'S'){

            System.out.println("Informe o ano do carro que deseja comprar: ");
            anoCarro = leitor.nextInt();
            System.out.println("Informe o valor do carro: ");
            valorCarro = leitor.nextFloat();

            if(anoCarro <= 2000){
                valorDesconto = valorCarro * descontoVelho;
                totalVelho++;
            } else {
                valorDesconto = valorCarro * descontoNovo;
            }
            totalCarros++;

            valorTotal = valorCarro - valorDesconto;
            System.out.println("O valor de desconto para o carro do ano de " + anoCarro + " é: " + valorDesconto);
            System.out.println("Valor total a pagar: " + valorTotal);

            System.out.println("Deseja efetuar uma nova consulta? S/N");
            continuar = leitor.next().charAt(0);


        }

            System.out.println("Total de carros antigos consultados: " + totalVelho);
            System.out.println("Total de carros novos consultados: " + totalCarros);

        leitor.close();
    }
}
