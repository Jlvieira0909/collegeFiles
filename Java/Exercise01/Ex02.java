import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Primeiro Numero");
        double n1 =  sc.nextDouble();
        System.out.println("Digite o Segundo Numero");
        double n2 = sc.nextDouble();
        System.out.println("Digite o Terceiro Numero");
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Média: " + media);
        sc.close();
    }
}
