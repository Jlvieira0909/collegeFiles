import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua Idade em Anos");
        int anos = sc.nextInt();
        int batimentos = anos * 365 * 24 * 60 * 60;
        System.out.println("Batimentos em " + anos + " anos: " + batimentos);
        sc.close();
    }
}
