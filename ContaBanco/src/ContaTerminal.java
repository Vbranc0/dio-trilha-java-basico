
import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        String conta = scanner.next();

        System.out.println("Por favor, digite o valor de su depósito inicial: ");
        String saldo = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + ", e seu saldo é de R$ " + saldo + ", já está disponível para saque.");

        scanner.close();

    }


}
