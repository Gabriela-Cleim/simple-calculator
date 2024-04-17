import java.util.Scanner;

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
