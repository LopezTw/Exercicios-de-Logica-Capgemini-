// Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua média (aritmética)

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        String nomeAluno;
        float prova1 = 0.0f;
        float prova2 = 0.0f;
        float prova3 = 0.0f;
        float media = 0.0f;

        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite o nome do aluno: ");
            nomeAluno = leitura.nextLine();
            System.out.println("Insira a nota da primeira PROVA: ");
            prova1 = leitura.nextFloat();
            System.out.println("Insira a nota da segunda PROVA: ");
            prova2 = leitura.nextFloat();
            System.out.println("Insira a nota da terceira PROVA: ");
            prova3 = leitura.nextFloat();
        }

        media = (prova1 + prova2 + prova3) / 3;

        System.out.println("A média das notas do Aluno: " + nomeAluno + " é: " + media);
        
    }
}
