import java.util.Scanner;
import java.io.IOException;
 import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws IOException {
        int conta;
        String agencia;
        String nomeCliente; 
        double saldo;
 
        Locale.setDefault(new Locale("en", "US"));
        Scanner entra = new Scanner(System.in);
 
        System.out.println("Por favor, digite o número da agência ! \n");
        System.out.println("Conta :");
        conta = entra.nextInt();

        System.out.println("Agência: ");
        agencia = entra.next();

        System.out.println("Nome Cliente : " );
        nomeCliente = new Scanner(System.in).nextLine();  
   

        System.out.println("Saldo:  ");
        saldo = entra.nextDouble();
   
  
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,  conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo );
 
 
 entra.close();

    }
 
}