// Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias: 
// a. Infantil A = 5 - 7 anos;
// b. Infantil B = 8 - 10 anos;
// c. Juvenil A = 11- 13 anos;
// d. Juvenil B = 14 - 17 anos;
// e. Sênior = 18 - 25 anos.

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner leitor = new Scanner(System.in)) {
            int idade = 0;

            System.out.println("Informe a idade:");
            idade = leitor.nextInt();

            if (idade >= 5 && idade <= 7){
                System.out.println("Categoria: Infantil A" );
            } else if(idade >= 8 && idade <= 10){
                System.out.println("Categoria: Infantil B" );
            } else if(idade >= 11 && idade <= 13){
                System.out.println("Categoria: Juvenil A" );
            } else if(idade >= 14 && idade <= 17){
                System.out.println("Categoria: Juvenil B" );
            } else if(idade >= 18 && idade <= 25){
                System.out.println("Categoria: Sênior" );
            } else {
                System.out.println("Idade fora da Faixa Etária !" );
            }
        }

    }
}
