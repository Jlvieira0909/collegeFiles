import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a taxa de consumo do refrigerador");
        double taxaConsumo = sc.nextDouble();
        System.out.println("Digite o tempo que o refrigerador permaneceu ligado");
        double tempo = sc.nextDouble();
        System.out.println("Digite o valor do kilowatt por hora");
        double valorKwh = sc.nextDouble();
        double energia = taxaConsumo * tempo;
        double valor = energia * valorKwh;
        System.out.println("Energia gasta: " + energia + " kWh");
        System.out.println("Valor a pagar: " + valor);
        sc.close();
    }
}
