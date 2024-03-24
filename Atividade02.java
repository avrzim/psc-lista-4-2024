import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        String nome, senha;
        do{
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();
            System.out.println("Digite sua senha: ");
            senha = input.nextLine();

            if (senha.equalsIgnoreCase(nome)){
                System.out.println("Senha inválida! Tente novamente.");
            }
        }while(senha.equalsIgnoreCase(nome));

        System.out.println("Nome e senha válidos!" + "\n" + "O nome escolhido foi: " + nome + "\n" + "A senha escolhida foi: " + senha);
        input.close();
    }
}