// Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
// preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        float precoCusto = 0.0f;
        float percentual = 0.0f;
        float precoVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o preço de Custo do produto: ");
        precoCusto = leitor.nextFloat();
        System.out.print("Digite o percentual de acréscimo para o preço de venda (em %): ");
        percentual = leitor.nextFloat();

        // Essa parte da expressão adiciona o valor decimal do percentual ao valor 1..
        precoVenda = precoCusto * (1 + (percentual / 100)); 

        System.out.println("O preço de venda do produto é: R$" + precoVenda);

        leitor.close();

        // Posso adicionar uma estrutura de repetição WHILE, pra fazer essas contas inúmeras vezes.
        
    }
}
