import java.util.Scanner;
/*
 * Calculadora Simples: Crie um programa que solicite dois números do usuário e realize operações 
 * matemáticas básicas (adição, subtração, multiplicação, divisão) com esses números.
 */
public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque o primeiro valor");
        int numberOne = scanner.nextInt();

        System.out.println("Coloque o operador matematico");
        String sign = scanner.next();

        System.out.println("Coloque o segundo valor");
        int numberTwo = scanner.nextInt();

        switch (sign) {
            case "+":
                System.out.println("O resultado é: ");
                System.out.println(numberOne + numberTwo);
                break;
            case "-":
                System.out.println("O resultado é: ");
                System.out.println(numberOne - numberTwo);
                break;        
            case "*":
                System.out.println("O resultado é: ");
                System.out.println(numberOne * numberTwo);
                break;
            case "/":
                System.out.println("O resultado é: ");
                System.out.println(numberOne / numberTwo);
                break;
            default: System.out.println("Valor invalido");
                break;
        }


        scanner.close();
    }
}
