//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
//sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
//Recuperação (media entre 5.1 a 6.9)

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        String nomeAluno;
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        float media = 0.0f;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        nomeAluno = leitor.nextLine();
        System.out.println("Informe as notas do aluno " + nomeAluno);
        System.out.println("Primeira Nota: ");
        nota1 = leitor.nextFloat();
        System.out.println("Segunda Nota: ");
        nota2 = leitor.nextFloat();
        System.out.println("Terceira Nota: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.println("Aprovado!");
        } else if (media >= 5.1 && media <= 6.9){
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado!");
            }
        
        System.out.println("A média do aluno " + nomeAluno + " é: " + media);

        leitor.close();
    }   
}
