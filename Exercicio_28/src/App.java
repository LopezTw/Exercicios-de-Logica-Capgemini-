//Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
//com os seguintes critérios:

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner leitor = new Scanner(System.in)) {
            String nomeFuncionario;
            double salario = 0.0d;
            float salarioMinimo = 100.0f;
            double reajusteSalario = 0.0d;
            double porcentagem = 0.0d;
            double folhaPagamento = 0.0d;
            double folhaPagamentoPorcentagem = 0.0d; // Um luxo apenas

            // Neste caso utilizaremos 3 pessoas como exemplo, ao invés de 584.
            int i = 0;
            for(; i < 3; i++){

                System.out.println("Informe o nome do funcionário: ");
                nomeFuncionario = leitor.next();
                System.out.println("Informe o sálario atual: ");
                salario = leitor.nextDouble();

                if(salario < salarioMinimo * 3 ){
                    porcentagem = 0.50;
                } else if(salario >= salarioMinimo * 3 && salario <= salarioMinimo * 10){
                    porcentagem = 0.20;
                } else if(salario > salarioMinimo * 10 && salario <= salarioMinimo * 20){
                    porcentagem = 0.15;
                } else {
                    porcentagem = 0.10;
                }

                reajusteSalario = salario + (salario * porcentagem); // Mostrar a porcentagem

                System.out.println("NOME: " + nomeFuncionario);
                System.out.println("SALÁRIO ANTIGO: R$" + salario);
                System.out.println("SALÁRIO REAJUSTADO: R$" + reajusteSalario);



            }

            folhaPagamento = (reajusteSalario - salario) * i;

            folhaPagamentoPorcentagem = ((reajusteSalario - salario) / salario) * 100;

            System.out.println("O aumento da folha salarial foi de: R$" + folhaPagamento);
            System.out.println("O aumento da folha salarial foi de: " + folhaPagamentoPorcentagem + "%");
        }
        
    }
}
