import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ano;
        double A, B, porcA, porcB;

        System.out.println("Digite a população da cidade com menos números de habitantes (A): ");
        A = input.nextDouble();

        System.out.println("Digite a taxa de crescimento anual dela: ");
        porcA = input.nextDouble();

        System.out.println("Digite a população da cidade com mais números de  (B): ");
        B = input.nextDouble();

        System.out.println("Digite a taxa de crescimento anual dela ");
        porcB = input.nextDouble();
        
        ano = 0;

        while( A <= B){
            A = A * (1 + (porcA / 100));
            B = B * (1 + (porcB / 100));
            ano++;
        }
        System.out.println("A cidade A passou a B quando chegou em: " + ano + "anos");
        System.out.println("O número de habitantes na cidade A é: " + A);
        System.out.println("O número de habitantes na cidade B é: " + B);
        input.close();
    }
}