package br.com.caelum.banco.util;

public abstract class Diretor extends Funcionario implements Autenticavel {
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}

}
