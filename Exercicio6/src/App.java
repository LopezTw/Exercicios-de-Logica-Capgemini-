import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        int a = 0;
        int b = 0;
        int temp = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digita o valor de A: ");
        a = leitura.nextInt();
        System.out.println("Digita o valor de B: ");
        b = leitura.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Os valores de A e B são: " + " A = " + a + " B = " + b);

    }
}
