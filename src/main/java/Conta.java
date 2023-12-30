import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ClienteConta clienteConta = new ClienteConta();

        System.out.println("Por favor digite o seu nome! ");
        clienteConta.nome = scanner.next();

        System.out.println("\n Por favor digite o número da Agência! ");
        clienteConta.agencia = scanner.next();

        System.out.println("Por favor digite o número da Conta! ");
        clienteConta.numero = scanner.nextInt();

        System.out.println("\n Por favor digite o seu Saldo! ");
        clienteConta.saldo = scanner.nextDouble();

        System.out.println(clienteConta.toString());

    }
}
