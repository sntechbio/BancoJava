package br.com.caelum.banco.util;

// COM A CLASSE ABSTRATA O FUNCIONARIO NÃO PODE SER INSTANCIADO, APENAS REFERENCIADO
public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected int senha;
	protected double salario;
	
	// MÉTODO ABSTRATO , ESSE MÉTODO SEMPRE PRECISARÁ SER REESCRITO PELAS CLASSES FILHAS
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
