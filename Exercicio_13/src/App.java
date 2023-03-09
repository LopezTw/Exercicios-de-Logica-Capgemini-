/**Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */

 import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Você está preso em um loop, para sair é facil, digite um numero: ");
        while(num < 10){

            
            num = leitor.nextInt();

            if(num >= 10){
                System.out.println("Você conseguiu, nem foi dificil né?");
            } else {
                System.out.println("Você achou mesmo que digitando " + num + " você sairia daqui?");
                System.out.println("TENTE NOVAMENTE !");
            }       

        }

        /** Eu aprimorei o simples algoritmo para uma brincadeira, pra tornar mais divertido. */
        leitor.close();
    }
}
