import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de horas trabalhadas");
        double horas = sc.nextDouble();
        System.out.println("Insira o valor da hora trabalhada");
        double valorHora = sc.nextDouble();
        double salario = horas * valorHora;
        double desconto = salario * 0.06;
        double salarioLiquido = salario - desconto;
        System.out.println("Salário com desconto: " + salarioLiquido);
        sc.close();
    }
}
