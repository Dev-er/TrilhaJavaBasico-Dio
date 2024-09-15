import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        var infoCliente = scanner.nextLine();
        System.out.println("Entre com agência: ");
        var infoAgencia = scanner.nextLine();
        System.out.println("Entre com sua conta: ");
        int infoConta = scanner.nextInt();
        System.out.println("Entre com o saldo: ");
        double infoSaldo = scanner.nextDouble();

        System.out.println("Olá " + infoCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é: "
                + infoAgencia + ", conta: " + infoConta + " e seu saldo: "
                + infoSaldo + " já está disponível para saque.");
    }
}