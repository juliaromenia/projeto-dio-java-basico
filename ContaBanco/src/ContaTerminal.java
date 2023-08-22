/*Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque". */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));

        System.out.println("Qual o seu nome:  ");
        String nome = scanner.next();

        System.out.println("Digite o numero da sua conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o número da sua agência (com o dígito): ");
        String agencia = scanner.next();

        System.out.println("Qual o valor deseja sacar? ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e o seu saldo de " + saldo + " já está disponível para saque");
    }
}