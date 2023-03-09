//Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
//ou não para cumprir o serviço militar obrigatório. Informe os totais;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        String nome;
        String sexo;
        String aprovado = "APROVADO";
        String reprovado = "REPROVADO";
        String status;
        int idade = 0;
        int saude = 0;
        int totalAprovado = 0;
        int totalReprovado = 0;
        char continuar = 's';
        
          
        while(continuar == 's' || continuar == 'S'){

            System.out.println("Informe o nome: ");
            nome = leitor.next();
            
            System.out.println("Informe o sexo M/F: ");
            sexo = leitor.next();
            if(sexo == "f" || sexo == "F"){
                sexo = "Feminino";
            } else {
                sexo = "Masculino";
            } 
            // We can add more genders without problem and optimize this code about wrong write


            System.out.println("Informe a idade: ");
            idade = leitor.nextInt();

            System.out.println("Informe a saúde 1- BOA | 2- RUIM: ");
            saude = leitor.nextInt();

            if(idade < 18 || saude == 2){
                status = reprovado;
                totalReprovado++;
            } else {
                status = aprovado;
                totalAprovado++;
            }
            
           /**  System.out.println("Informe a idade: ");
            idade = leitor.nextInt();
            if(idade < 18){
                status = reprovado;
            }

            System.out.println("Informe a saúde 1- BOA | 2- RUIM: ");
            saude = leitor.nextInt();
            if(saude == 1){
                status = aprovado;
                totalAprovado++;
            } else {
                status = reprovado;
                totalReprovado++;
            }
            */


            System.out.println("NOME: " + nome);
            System.out.println("SEXO: " + sexo);
            System.out.println("Idade " + idade);
            System.out.println("SAÚDE: " + saude);
            System.out.println("STATUS: " + status);

            System.out.println("Deseja fazer mais uma consulta? S/N");
            continuar = leitor.next().charAt(0);
        }

        System.out.println("Total Aprovado: " + totalAprovado);
        System.out.println("Total Reprovado: " + totalReprovado);
    }
}
