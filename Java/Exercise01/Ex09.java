import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa");
        String nome1 = sc.next();
        System.out.println("Digite a idade da primeira pessoa");
        int idade1 = sc.nextInt();
        System.out.println("Digite o peso da primeira pessoa");
        double peso1 = sc.nextDouble();
        System.out.println("Digite o nome da segunda pessoa");
        String nome2 = sc.next();
        System.out.println("Digite a idade da segunda pessoa");
        int idade2 = sc.nextInt();
        System.out.println("Digite o peso da segunda pessoa");
        double peso2 = sc.nextDouble();
        System.out.println("Digite o nome da terceira pessoa");
        String nome3 = sc.next();
        System.out.println("Digite a idade da terceira pessoa");
        int idade3 = sc.nextInt();
        System.out.println("Digite o peso da terceira pessoa");
        double peso3 = sc.nextDouble();
        double mediaIdade = (idade1 + idade2 + idade3) / 3.0;
        double mediaPeso = (peso1 + peso2 + peso3) / 3.0;
        System.out.println("Idade média: " + mediaIdade);
        System.out.println("Peso médio: " + mediaPeso);
        sc.close();
    }
}
