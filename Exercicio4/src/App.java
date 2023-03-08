//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
//por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
//efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        String nome;
        float salario = 0.0f;
        float totalVendas = 0.0f;
        double comissao = 0.0f;
        double porcentagem = 0.15;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        nome = leitor.nextLine();
        System.out.println("Informe o salário do vendedor: ");
        salario = leitor.nextFloat();
        System.out.println("Informe o total de vendas do vendedor: ");
        totalVendas = leitor.nextFloat();

        System.out.println("NOME: " + nome);
        System.out.println("SALARIO: R$" + salario);
        System.out.println("TOTAL DE VENDAS: R$" + totalVendas);
        comissao = totalVendas * porcentagem;
        System.out.println("COMISSÃO: R$" + comissao);

    }
}
