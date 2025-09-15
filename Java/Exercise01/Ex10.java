import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade em anos");
        int anos = sc.nextInt();
        System.out.println("Digite quantos meses voce tem");
        int meses = sc.nextInt();
        System.out.println("Digite quantos dias voce tem");
        int dias = sc.nextInt();
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Idade em dias: " + totalDias);
        sc.close();
    }
}
