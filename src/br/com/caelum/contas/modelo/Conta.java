package br.com.caelum.contas.modelo;

public class Conta {
	
	private String titular;
	private int numero;
	private int limite;
	private String agencia;
	protected double saldo;
	
	public void saca(double valor) {
		if (valor < this.saldo) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Impossível realizar operação");
		}
	}
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
		} else {
			System.out.println("Impossível realizar operação");
		}
	}
	
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		return dados;
	}
	
	public void tranfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
}

