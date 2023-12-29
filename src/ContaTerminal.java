import java.util.Scanner;

public class ContaTerminal {
    int numeroAgencia;
    String nomeAgencia, nomeCliente;
    double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência:");
        conta.numeroAgencia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o nome da Agência:");
        conta.nomeAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        conta.nomeCliente = scanner.nextLine();

        boolean entradaValida = false;
        do {
            System.out.println("Por favor, digite o Saldo:");
            try {
                String inputSaldo = scanner.nextLine().trim(); 
                conta.saldo = Double.parseDouble(inputSaldo);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor de saldo válido.");
            }
        } while (!entradaValida);

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.nomeAgencia + ", conta " + conta.numeroAgencia + " e seu saldo " + conta.saldo
                + " já está disponível para saque.");

        scanner.close();
    }
}
