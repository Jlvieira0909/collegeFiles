import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);

        scanner.close();
    }
}
