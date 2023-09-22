package bancoDigital;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	protected int agencia;
	protected static int conta;
	protected double saldo;	
	
	private static int SEQUENCIAL = 1;

	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
	}
	

	
	@Override
	public void sacar(double valor) {
		if (valor < saldo) {
			saldo -= valor;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


}
