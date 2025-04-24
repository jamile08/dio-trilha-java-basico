import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta!");
        conta.setNumero(in.nextInt());
        in.nextLine();
        System.out.println("Por favor, digite o número da agência!");
        conta.setAgencia(in.nextLine());
        System.out.println("Por favor, digite o seu nome!");
        conta.setNomeClinte(in.nextLine());
        System.out.println("Por favor, digite o seu saldo!");
        conta.setSaldo(in.nextBigDecimal());
        System.out.println("Olá " + conta.getNomeClinte() + ", obrigado por criar uma conta em nosso banco, sua " +
                "agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " +
                conta.getSaldo() + " já está disponível para saque.");
    }
}