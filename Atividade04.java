import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ano;
        double A, B;

        ano = 0;
        A = 80000;
        B = 200000;

        while( A <= B){
            A = A * 1.03;
            B = B * 1.015;
            ano++;
        }
        System.out.println("A cidade A passou a B quando chegou em: " + ano + "anos");
        System.out.println("O número de habitantes na cidade A é: " + A);
        System.out.println("O número de habitantes na cidade B é: " + B);
        input.close();
    }
}