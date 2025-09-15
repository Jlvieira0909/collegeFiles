import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final double CUSTO_M2 = 100.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio da lata");
        double raio = sc.nextDouble();
        System.out.println("Digite a altura da lata");
        double altura = sc.nextDouble();
        double area = 2 * PI * raio * (raio + altura);
        double custo = area * CUSTO_M2;
        System.out.println("Custo da lata: " + custo);
        sc.close();
    }
}
