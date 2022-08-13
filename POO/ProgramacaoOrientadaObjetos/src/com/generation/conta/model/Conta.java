package com.generation.conta.model;

public class Conta {

	private int numero;
	private String agencia;
	private String tipo;
	private String Titular;
	private float saldo;
	
	public Conta(int numero, String agencia, String tipo, String titular, float saldo) {
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		Titular = titular;
		this.saldo = saldo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void visualize() {
		System.out.println("Dados da Conta: \n");
		System.out.println("Numero da conta "+this.numero);
		System.out.println("Tipo de conta: "+this.tipo);
		System.out.println("Agência: "+this.agencia);
		System.out.println("Nome do Titular: "+this.Titular);
		System.out.println("Saldo: "+this.saldo);
		}
	public boolean sacar(float valor){//criei um float com o nome valor, que é o valor que será colocado no saque no Menu{
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("******************************************");
			System.out.println("Valor do saque: "+valor+". Seu novo saldo é de: "+saldo);
			return true; //se for vdde
		}
		else {
			System.out.println("Saldo insuficiente");
					return false;
		}
	}
	
}
