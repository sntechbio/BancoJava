package br.com.caelum.banco.util;

public class TesteBonificacoes {

	public static void main(String[] args) {
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		
		System.out.println(controle.getTotalDeBonificacoes());
		
		}
}
