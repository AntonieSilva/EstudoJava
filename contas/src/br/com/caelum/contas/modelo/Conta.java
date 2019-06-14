package br.com.caelum.contas.modelo;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	private double limite;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) {
		if (this.saldo + this.limite >= valor) {
			this.saldo -= valor;
		}

	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public double calculaRendimento() {
		return saldo * 0.1;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public Conta() {

	}

	public Conta(String titular, String agencia, int numero) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;

	}

	public void setTitular(String titular) {
		this.titular = titular;

	}

	public String getTitular() {
		return this.titular;

	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;

	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public String getTipo() {
		return "Conta";
	}
}