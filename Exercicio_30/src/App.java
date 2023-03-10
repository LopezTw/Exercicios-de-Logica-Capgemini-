//Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro número:");
        num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 < num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }

        sc.close();
    }
}
