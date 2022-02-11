package br.com.caelum.banco.util;

//herança
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	// REESCRITA DE MÉTODO, HERDANDO MÉTODOS DA CLASSE MÃE funcionário
	@Override
	public double getBonificacao() {	
		return this.salario * 1.4 + 1000;
		//Essa invocação vai procurar o método com o nome getBonificacao de uma classe super (mãe)
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}	
