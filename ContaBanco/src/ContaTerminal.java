import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner Conta = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = Conta.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = Conta.nextLine();
        Conta.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = Conta.nextLine();

        System.out.println("Saldo:");
        double saldo = Conta.nextDouble();

        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco,sua agência é: "
         + agencia + " Conta: " + numero + " e seu saldo é: " + saldo + " ja está disponivel para saque. " ) ;
        
    }
}