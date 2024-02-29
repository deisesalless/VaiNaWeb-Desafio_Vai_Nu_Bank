package br.com.desafio.entidades;

public abstract class Conta {
	private int agencia;
	private int numero;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero) {
		super();
		this.agencia = agencia;
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
