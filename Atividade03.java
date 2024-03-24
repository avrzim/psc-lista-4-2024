import java.util.Scanner;

public class Atividade03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        do{
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();

            if (nome.length() <= 3){
                System.out.println("Digite um nome com mais de 3 letras!");
            }
        }while (nome.length() <= 3);

        int idade;
        do{
            System.out.println("Digite sua idade: ");
            idade = input.nextInt();

            if (idade <= 0 || idade >= 150){
                System.out.println("Idade inválida! Tente novamente com uma idade entre 0 e 150.");
            }
        } while (idade <= 0 || idade >= 150);

        double salario;
        do{
            System.out.println("Digite seu salário: ");
            salario = input.nextDouble();

            if (salario <= 0){
                System.out.println("Salário inválido! Tente novamente.");
            }
        } while (salario <= 0);

        char sexo;
        do{
            System.out.println("Digite seu sexo ('f' ou 'm'): ");
            sexo = input.next().toLowerCase().charAt(0);

            if (sexo != 'f' && sexo != 'm'){
                System.out.println("Sexo inválido! Digite o sexo 'f' para feminino e 'm' para masculino");
            }
        }while (sexo != 'f' && sexo != 'm');

        char estadoCivil;
        do {
            System.out.println("Digite seu estado civil ('s', 'c', 'v', 'd'): ");
            estadoCivil = input.next().toLowerCase().charAt(0);
            
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Estado civil inválido! Digite ('s', 'c', 'v', 'd').");
            }
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Seus dados são: ");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu salário é: " + salario);
        System.out.println("Seu sexo é: " + sexo);
        System.out.println("Seu estado civil é: " + estadoCivil);
        input.close();
    }
}