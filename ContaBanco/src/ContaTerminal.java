import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"))) {
            
            System.out.println("Qual o seu nome:  ");
            String nome = scanner.next();

            System.out.println("Digite o numero da sua conta: ");
            int conta = scanner.nextInt();
            
            System.out.println("Digite o número da sua agência (com o dígito): ");
            String agencia = scanner.next();

            System.out.println("Qual o valor deseja sacar? ");
            double saldo = scanner.nextDouble();
            
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e o seu saldo de " + saldo + " já está disponível para saque!");
        }
    }
}