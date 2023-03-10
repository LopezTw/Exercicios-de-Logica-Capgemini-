import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        double a = 0.0d;
        double b = 0.0d;
        double resultado = 0.0d;
        char c;

        System.out.println("Insira o primeiro valor: ");
        a = leitor.nextDouble();
        System.out.println("Insira o segundo valor: ");
        b = leitor.nextDouble();
        System.out.println("Insira o sinal da operação que deseja fazer: ");
        c = leitor.next().charAt(0);

        if(c == '+'){
            resultado = a + b;
            System.out.println(a + " + " + b + " = " +  resultado);
        } else if(c == '-'){
            resultado = a - b;
            System.out.println(a + " - " + b + " = " +  resultado);
        } else if(c == '*'){
            resultado = a * b;
            System.out.println(a + " * " + b + " = " +  resultado);
        } else if(c == '/'){
            if(a == 0 || b == 0){
                System.out.println("Proibido divisão por ZERO !");
            } else{
                resultado = a / b;
                System.out.println(a + " / " + b + " = " +  resultado);
            }
        } else {
            System.out.println("Operador Inválido !");
        }
            

        
        

    }
}
