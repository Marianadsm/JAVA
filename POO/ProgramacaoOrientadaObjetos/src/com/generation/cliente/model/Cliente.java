package com.generation.cliente.model;

public class Cliente {

	private String nome;
	private int idade;
	private String nacionalidade;
	private float altura;
	
	public Cliente(String nome, int idade, String nacionalidade, float altura) {
	
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void visualize() {
		System.out.println("Cliente: \n");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade : "+this.idade);
		System.out.println("Nacionalidade: "+this.nacionalidade);
		System.out.println("Altura: "+this.altura);
		
	}
}
