import java.util.ArrayList;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	private ArrayList<String> transacoes = new ArrayList<>();

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		Transacao transacao = new Transacao();
		transacoes.add(transacao.getInfo(" Saque de R$ " + valor));
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		Transacao transacao = new Transacao();
		transacoes.add(transacao.getInfo("Deposito de R$ " + valor));
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		Transacao transacao = new Transacao();
		String transferencia = String.format("Transferencia de R$ %.2f para %s(%s)", 
			valor, contaDestino.getNomeCliente(), contaDestino.getTipo());
		transacoes.add(transacao.getInfo(transferencia));
	}

	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNomeCliente() {
		return cliente.getNome();
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("Transacoes realizadas:");
		for(int i = 0; i < transacoes.size(); i++) {
			System.out.println(transacoes.get(i));
		}
	}
}
