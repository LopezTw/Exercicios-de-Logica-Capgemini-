//Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
//(inclusive);;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        // Para testar o código eu vou apenas fazer com 3 numeros !

        int count = 0; // Contador pra armazenar a qtd de numeros no intervalo   
        Scanner leitor = new Scanner(System.in);

        for(int i = 1; i <= 4; i++){ //cria variavel int i e lê 4 numeros
            System.out.println("Insira o " + i +  "º valor: ");
            int num = leitor.nextInt(); // cria a variavel num e insere o valor pelo Scanner

            if(num >= 10 && num <= 150) {
                count++; // incrementa o contador
            }

        }
        
        System.out.println(count + " numeros estão entre 10 e 150.");
        leitor.close();
    }
}
