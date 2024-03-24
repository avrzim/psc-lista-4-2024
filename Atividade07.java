import java.util.Scanner;

public class Atividade07 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double num1, num2, num3, num4 , num5, maior;

    System.out.println("Digite o primeiro número: ");
    num1 = input.nextDouble();

    System.out.println("Digite o segundo número: ");
    num2 = input.nextDouble();

    System.out.println("Digite o terceiro número: ");
    num3 = input.nextDouble();

    System.out.println("Digite o quarto número: ");
    num4 = input.nextDouble();

    System.out.println("Digite o quinto número: ");
    num5 = input.nextDouble();

    maior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));

    System.out.println("O maior número desses 5 números é: " + maior);

    input.close();
   } 
}