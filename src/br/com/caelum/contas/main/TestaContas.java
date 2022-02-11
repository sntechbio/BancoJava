package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TestaContas {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		double valor = 5000;
		
		minhaConta.saca(valor);
		
		

	}

}
