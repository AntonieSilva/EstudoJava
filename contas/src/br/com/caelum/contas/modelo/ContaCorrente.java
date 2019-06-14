package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	@Override
	public void saca (double valor) {
		super.saca (valor + 0.10);
	}

}
