import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o publico total presente na partida");
        int publico = sc.nextInt();
        int popular = (int) (publico * 0.1);
        int geral = (int) (publico * 0.5);
        int arquibancada = (int) (publico * 0.3);
        int cadeiras = publico - (popular + geral + arquibancada);
        double renda = (popular * 1.0) + (geral * 5.0) + (arquibancada * 10.0) + (cadeiras * 20.0);
        System.out.println("Renda do jogo: " + renda);
        sc.close();
    }
}
