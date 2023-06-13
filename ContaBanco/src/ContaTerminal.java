import java.util.Scanner;
import java.io.IOException;

public class ContaTerminal {
    public static void main(String[] args) throws IOException {
        int numero;
        String agencia;
        String nomeCliente; 
        double saldo;

        Scanner entra = new Scanner(System.in);
 
        System.out.println("Por favor, digite o número da agência ! \n");
        System.out.println("Número :");
        numero = entra.nextInt();

        System.out.println("Agência: ");
        agencia = entra.next();

        System.out.println("Saldo:  ");
        saldo = entra.nextDouble();

        System.out.println("Nome Cliente :" );
        nomeCliente = entra.next();
 
 System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,  conta %d e seu saldo %.2f  já está disponível para saque.", nomeCliente, agencia, numero, saldo );
 
 entra.close();

    }
 
}
