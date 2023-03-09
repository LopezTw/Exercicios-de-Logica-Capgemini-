//Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
//mulher. No final informe total de homens e de mulheres;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        String nome;
        char sexo = 'F';        
        int totalMulheres = 0;
        int totalHomens = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Informe o nome: ");
            nome = leitor.nextLine();

            System.out.println("Informe o sexo: M/F");
            sexo = leitor.nextLine().charAt(0);
            
            if(sexo == 'F' || sexo == 'f'){
                System.out.println("Nome: " + nome);
                System.out.println("Sexo: " + sexo);
                totalMulheres++;   
            } else {
                System.out.println("Nome: " + nome);
                System.out.println("Sexo: " + sexo);
                totalHomens++;
            }       
        }

        System.out.println("Total de  Homens: " + totalHomens);
        System.out.println("Total de  Mulheres: " + totalMulheres);

        leitor.close();
    }
}
