import java.util.Scanner;

public class SomaTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        if (sum < 100) {
            System.out.println("O valor não tem desconto");
        } else {
            System.out.println("Excelente compra!");
        }


        scanner.close();
    }
}