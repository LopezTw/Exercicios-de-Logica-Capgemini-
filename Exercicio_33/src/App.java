// A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
// calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
// a. Professor Nível 1 R$12,00 por hora/aula;
// b. Professor Nível 2 R$17,00 por hora/aula;
// c. Professor Nível 3 R$25,00 por hora/aula.

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int nivel = 0;
            double valorAula = 0.00d;
            double valorDia = 0.00d; // Valor que recebe por dia trabalhado
            double salario = 0.00d;
            int horas = 0;
            String nome;

            System.out.println("Informe seu nome: ");
            nome = leitor.next();
            System.out.println("Informe o seu Nivel: ");
            nivel = leitor.nextInt();
            System.out.println("Quantas horas por dia você trabalha? ");
            horas = leitor.nextInt();

            if(horas > 15.5){ // Tem professor que da Aula Manhã, Tarde e Noite
                System.out.println("Quantidade de horas inserida Inválida!");
            } else {
                switch(nivel){

                    case 1:
                        valorAula = 12.00;
                        valorDia = valorAula * horas; 
                        break;
                    case 2:
                        valorAula = 17.00;
                        valorDia = valorAula * horas;
                        break;
                    case 3:
                        valorAula = 25.00;
                        valorDia = valorAula * horas;
                        break;
                    default:
                        System.out.println("Nível inválido!");    
                }
            }

            
      
            salario = valorDia * 20; // 20 dias no mês
            System.out.println("Professor: " + nome);
            System.out.println("Salário: " + salario);
        }

    }
}
