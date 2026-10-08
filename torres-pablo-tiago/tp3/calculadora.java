import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer numero: ");
        double a = sc.nextDouble();

        System.out.print("Operacion (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Segundo numero: ");
        double b = sc.nextDouble();

        double res = 0;

        if (op == '+') res = a + b;
        else if (op == '-') res = a - b;
        else if (op == '*') res = a * b;
        else if (op == '/') res = a / b;

        System.out.println("Resultado: " + res);
        sc.close();
    }
}