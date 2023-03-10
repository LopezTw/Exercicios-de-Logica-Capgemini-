//A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
//algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
//calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel 
//–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
//clientes;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        double valorDesconto = 0.0f;
        double valorTotal = 0.0f;
        double valorVeiculo = 0.0f;
        double combustivel = 0.0f;
        int num;

        char continuar = 's';

        while(continuar == 's' || continuar == 'S'){
            System.out.println("Insira o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();

            if(valorVeiculo <= 0){
                continuar = 'n';
                System.out.println("O valor do VEÍCULO não pode ser IGUAL ou MENOR que zero, CONSULTA ENCERRADA!");
            } else {

                do {
                    System.out.println("O veiculo utiliza qual combustivel? ");
                    System.out.println("Digite 1 para Álcool | 2- Gasolina | 3- Diesel" );
                    num = leitor.nextInt();

                    switch(num){

                    case 1:
                        combustivel = 0.25;
                        break;
                    case 2:
                        combustivel = 0.21;
                        break;
                    case 3:
                        combustivel = 0.14;
                        break;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA !");
                        break;
                    }    
                } while (num < 1  || num > 3 );
        

                valorDesconto = valorVeiculo * combustivel;
                valorTotal = valorVeiculo - valorDesconto;

                System.out.println("Desconto: $" + valorDesconto);
                System.out.println("Total pago: $" + valorTotal + "\n");

                System.out.println("Deseja fazer mais uma consulta? S/N");
                continuar = leitor.next().charAt(0);
            }
        }
        leitor.close();               
    }
}
