import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int soma = 0;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Insira o segundo numero: ");
        num2 = leitor.nextInt();

        soma = num1 + num2;
        System.out.println("A soma dos dois números é igual a: " + soma);
}
} 