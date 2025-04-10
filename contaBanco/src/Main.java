import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        contaTerminal conta = new contaTerminal();
        Scanner Sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu Nome: \n");
        conta.setNomeCliente(Sc.nextLine());
        System.out.println("Por favor, digite a sua agencia:\n");
        conta.setAgencia(Sc.nextLine());
        System.out.println("Por favor, digite o numero da sua agencia:\n");
        conta.setNumero(Sc.nextInt());
        System.out.println("Por favor, digite o seu Saldo:\n");
        conta.setSaldo(Sc.nextDouble());

        System.out.println("Olá "+ conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + conta.getAgencia() + ", "+ " conta: " + conta.getNumero() + " e o seu saldo: "+ conta.getSaldo());
    }
}