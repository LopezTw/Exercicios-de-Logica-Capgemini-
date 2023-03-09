//Faça um algoritmo que receba um valor que foi depositado e 
//exiba o valor com rendimento após um mês.
//Considere fixo o juro da poupança em 0,07% a. m

import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double juros = 0.07;
        double deposito = 0;
        double rendimento = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor do deposito");
        deposito = leitor.nextDouble();

        rendimento = deposito * juros;

        System.out.println("O rendimento ao mês é de: " + new DecimalFormat("#,##0.00").format(rendimento));
    }    
}
