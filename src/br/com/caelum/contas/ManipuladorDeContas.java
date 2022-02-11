package br.com.caelum.contas;

import br.com.caelum.contas.modelo.*;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;
	
	public void criaConta(Evento evento) {
		String tipo  = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta poupança")) {
			this.conta = new ContaPoupanca();
		}
	}
	
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("Destino");
		conta.tranfere(evento.getDouble("ValorTransferencia"), destino);
	}
	
	public void deposita(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.deposita(valor);
	}
	
	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.saca(valor);
	}
	
}
