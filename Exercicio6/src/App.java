//Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a 
//possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores 
//trocados;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        int a = 0;
        int b = 0;
        int temp = 0;

        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digita o valor de A: ");
            a = leitura.nextInt();
            System.out.println("Digita o valor de B: ");
            b = leitura.nextInt();
        }

        temp = a;
        a = b;
        b = temp;

        System.out.println("Os valores de A e B são: " + " A = " + a + " B = " + b);

    }
}
