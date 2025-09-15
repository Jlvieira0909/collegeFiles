import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Valor Atual da Cotação do Dolar");
        double cotacao = sc.nextDouble();
        System.out.println("Digite o Valor do Produto em Dólar");
        double valorDolar = sc.nextDouble();
        double valorReais = valorDolar * cotacao;
        System.out.println("Valor em reais: " + valorReais);
        sc.close();
    }
}
