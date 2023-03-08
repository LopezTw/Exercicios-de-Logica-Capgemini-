// Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
// total percorrida pelo automóvel e o total de combustível gasto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        float media = 0;
        float distanciaTotal = 0;
        float combustivelGasto = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a distancia total percorrida: ");
        distanciaTotal = leitor.nextFloat();
        System.out.println("Insira o total de combustivel que foi gasto: ");
        combustivelGasto = leitor.nextFloat();

        media = (distanciaTotal + combustivelGasto) / 2;
        System.out.println("A media do consumo deste automóvel é: " + media);
         

    }
}
