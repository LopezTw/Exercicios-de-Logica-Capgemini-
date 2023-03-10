// Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;


import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner leitor = new Scanner(System.in)) {
            int num = 0;

            System.out.println("Digite o número do mês: ");
            num = leitor.nextInt();
            switch(num){

                case 1:
                System.out.println(num + " - JANEIRO");
                    break;       
                case 2:
                System.out.println(num + " - FEVEREIRO");
                    break;
                case 3:
                System.out.println(num + " - MARÇO");    
                    break;
                case 4:
                System.out.println(num + " - ABRIL");
                    break;
                case 5:
                System.out.println(num + " - MAIO");  
                    break;
                case 6:
                System.out.println(num + " - JUNHO"); 
                    break;
                case 7:
                System.out.println(num + " - JULHO");  
                    break;
                case 8:
                System.out.println(num + " - AGOSTO");  
                    break;
                case 9:
                System.out.println(num + " - SETEMBRO");   
                    break;
                case 10:
                System.out.println(num + " - OUTUBRO");   
                    break;
                case 11:
                System.out.println(num + " - NOVEMBRO");  
                    break;
                case 12:;
                System.out.println(num + " - DEZEMBRO");  
                    break;    
                default:        
                System.out.println("MÊS INVÁLIDO !");
                    break;
            }
        }   
           
    }
}
