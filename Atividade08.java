import java.util.Scanner;

public class Atividade08 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double num1, num2, num3, num4 , num5, soma, media;

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

    soma = num1 + num2 + num3 + num4 + num5;

    media = soma / 5;

    System.out.println("A soma desses 5 números é: " + soma);
    System.out.println("A média desses 5 números é: " + media);

    input.close();
   } 
}