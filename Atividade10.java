import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, maior, menor;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        maior = Math.max(num1, num2);
        menor = Math.min(num1, num2);

        System.out.println("Os números no intervalo desses dois números são: ");

        for(int i = menor + 1; i < maior; i++){
            System.out.println(i);
        }
        input.close();
    }
}