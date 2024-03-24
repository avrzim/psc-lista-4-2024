import java.util.Scanner;

public class Atividade01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Digite um número entre 0 e 10:");
            numero = input.nextInt();

            if (numero < 0 || numero > 10){
                System.out.println("Valor inválido! Tente novamente.");
            }
        }while(numero < 0 || numero > 10);

        System.out.println("Valor válido! O número escolhido foi: " + numero);
        input.close();
    }
}