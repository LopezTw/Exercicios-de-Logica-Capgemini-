import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        float reais = 0.0f;
        float dolar = 0.0f;
        float cotacao = 0.0f;
        

        char continuar = 's';

        try (Scanner leitura = new Scanner(System.in)) {
            while(continuar == 's' || continuar == 'S'){
                System.out.println("Insira a quantidade de DOLAR que deseja converter pra BRL: ");
                dolar = leitura.nextFloat();

                System.out.println("Insira o valor da cotação atual: ");
                cotacao = leitura.nextFloat();

                reais = cotacao * dolar;

                System.out.println("A conversão do valor inserido é igual a: " + reais);

                System.out.println("Deseja fazer mais uma consulta? S/N");
                continuar = leitura.next().charAt(0);



            }
        }      
    }
}
