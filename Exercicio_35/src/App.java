// Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de 
// luz segue a tabela abaixo: 
// Tipo de Cliente Valor do KW/h
// a. (Residência) 0,60;
// b. (Comércio) 0,48;
// c. (Indústria) 1,29

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            String nome;
            int tipoCliente = 0;
            double valorKw = 0.00d;
            double contaLuz = 0.00d;
            double horas = 0.00d;

            System.out.println("Informe o nome do cliente: ");
            nome = leitor.next();
            System.out.println("Informe o tipo de cliente: ");
            tipoCliente = leitor.nextInt();
            System.out.println("Informe a quantidade de horas que foi utilizada a luz: ");
            horas = leitor.nextDouble();

            switch(tipoCliente){

                case 1:
                    valorKw = 0.60;
                    contaLuz = valorKw * horas;
                    break;
                case 2:
                    valorKw = 0.48;
                    contaLuz = valorKw * horas;
                    break;
                case 3:
                    valorKw = 1.29;
                    contaLuz = valorKw * horas;
                    break;
                default:
                    System.out.println("Tipo de cliente Inválido! ");
                    break;    
            }

            System.out.println("O valor da conta de Luz de " + nome + " é de: R$" + contaLuz);
        }
    }
}
