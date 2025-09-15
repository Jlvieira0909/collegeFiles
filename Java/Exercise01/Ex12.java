import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da taxa do aluguel por dia");
        double taxaDia = sc.nextDouble();
        System.out.println("Digite o valor da taxa por KM rodado");
        double taxaKm = sc.nextDouble();
        System.out.println("Insira a quatidade de dias alugados");
        int dias = sc.nextInt();
        System.out.println("Insira a quantidade de KM rodados");
        double km = sc.nextDouble();
        double desconto = taxaDia * 0.1 * dias;
        double valorTotal = (taxaDia * dias - desconto) + (taxaKm * km);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Desconto: " + desconto);
        System.out.println("Dias: " + dias);
        System.out.println("Km rodados: " + km);
        sc.close();
    }
}
