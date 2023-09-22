package bancoDigital;
import java.util.Scanner;

public class Main{
	private static int entrada, auxiliar, numeroConta, destino;

	public static void main(String[] args)  {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bem Vindo ao sistema bancário! \nO que deseja fazer? \n1- Nova Conta; 2- Usar conta existente. ");
		entrada = teclado.nextInt();
		
		if (entrada == 1) {
			Conta cc = new ContaCorrente();
			Conta poupanca = new ContaPoupanca();
			System.out.println("Conta criada!");
		}
		if (entrada == 2) {
			System.out.println("Informe o número da conta");
			numeroConta = teclado.nextInt();
			Conta auxiliar = new ContaCorrente();
			auxiliar = conta.get(numeroConta);

			
			System.out.println("1- Depositar; 2- Transferir; 3- Extrato. ");
			entrada = teclado.nextInt();
			if (entrada == 1) {
				auxiliar.depositar(100);
			}
			if (entrada == 2) {
				System.out.println("Insira a conta destino:");
				destino = teclado.nextInt();
				Conta contaDestino = new ContaCorrente();
				destino = Conta.get(contaDestino);
				auxiliar.transferir(50, destino);
			}
			if (entrada == 3) {
				auxiliar.imprimirExtrato();
			}
		}
		else {
			System.out.println ("Informar valor válido.");
		}

		
		
	}

}
