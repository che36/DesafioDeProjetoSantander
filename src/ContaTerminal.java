import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá,bem vindo ao banco Santander,agora vamos criar sua conta bancária: ");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número inteiro com 04 dígitos para a agência : ");
        int agencia = scanner.nextInt();

        System.out.print("Digite um número inteiro com 8 dígitos para a conta corrente : ");
        int contaCorrente = scanner.nextInt();
        System.out.println("Sua conta está criada, confira seus da dados : \n" + " nome: " + nome + "\n" + " agência " + agencia + "\n" + " conta corrente " + contaCorrente);
        scanner.close();

    }
}