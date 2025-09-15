import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor total do salário");
        double salario = sc.nextDouble();
        System.out.println("Insira o valor desejado do reajsute");
        double percentual = sc.nextDouble();
        double novoSalario = salario + (salario * percentual / 100);
        System.out.println("Novo salário: " + novoSalario);
        sc.close();
    }
}
