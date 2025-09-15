import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        final double MILIMETRO_POR_POLEGADA = 25.4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit");
        double f = sc.nextDouble();
        double c = (5 * (f - 32)) / 9;
        System.out.println("Celsius: " + c);
        System.out.println("Digite a quantidade de chuva em polegadas");
        double polegadas = sc.nextDouble();
        double mm = polegadas * MILIMETRO_POR_POLEGADA;
        System.out.println("Milímetros: " + mm);
        sc.close();
    }
}
