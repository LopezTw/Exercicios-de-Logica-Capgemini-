/** O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
mesmo; */

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
        float custoFabrica = 0.0f;
        float percentual = 0.28f;
        float custoCarro = 0.0f;
        float impostos = 0.45f;
        char continuar = 's';

        Scanner leitor = new Scanner(System.in);

        while(continuar == 's' || continuar == 'S'){

        System.out.println("Informe o custo de Fábrica do carro: ");
        custoFabrica = leitor.nextFloat();

        custoCarro = custoFabrica + (custoFabrica * impostos) + (custoFabrica * percentual);
        
        System.out.println("O preço do carro incluido taxas custa: " + custoCarro);

        System.out.println("Deseja fazer mais uma consulta? S/N ");
        continuar = leitor.next().charAt(0);


        }
        
        leitor.close();




    }
}
