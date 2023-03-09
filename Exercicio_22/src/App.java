//Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
//se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
//de venda de cada produto, amédia de preço de custo e do preço de venda;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        float media = 0.0f;

        int i = 0; // CRIANDO O FOR DESTA FORMA, CONSEGIGO APROVEITAR A VARIAVEL i NO RESTO DO CODIGO;
        for(; i < 3; i++){

            System.out.println("Insira o preço de Custo do Produto");
            precoCusto = leitor.nextFloat();

            System.out.println("Insira o preço de Venda do Produto");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if(precoCusto < precoVenda){
                System.out.println("Obteve LUCRO!");
            } else if (precoCusto == precoVenda){
                System.out.println("Não houve Lucro e nem Prejuizo!");
            } else {
                System.out.println("Obteve PREJUÍZO!");
            }

            System.out.println("Preço de Custo: " + precoCusto + "', Preço de Venda: " + precoVenda);

            
        }
            media = totalCusto / i; // Aproveitando a variavel i
            System.out.println("A media do Preço de Custo é: " + media);

        
    }
}
