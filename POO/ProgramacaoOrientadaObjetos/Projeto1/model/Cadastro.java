package Projeto1.model;

import java.util.Scanner;

public class Cadastro {

	private String Nome;
	private int Idade;
	private String Email;
	private String ID;
	private String Rua;
	private int numeroCasa;
	private int cep;

	
	public Cadastro(String nome, int idade, String iD, String rua, int numeroCasa, int cep) {
		
		Nome = nome;
		Idade = idade;
		ID = iD;
		Rua = rua;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
	}

	public String getNome() {
		return Nome;
	}

	public Cadastro(String nome, int idade, String email, String iD, String rua, int numeroCasa, int cep) {
		super();
		Nome = nome;
		Idade = idade;
		Email = email;
		ID = iD;
		Rua = rua;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setNome(String nome) {
		Nome = nome;
		
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	
	}
	
	public void visualizeCadastro() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String Nome = leia.next();
		System.out.println("Quantos anos voce tem? ");
		int Idade = leia.nextInt();
		System.out.println("Qual é o seu e-mail? ");
		String email = leia.next();
		System.out.println("Insira seu CPF: ");
		String ID = leia.next();
		System.out.println("Endereco: ");
		String Rua = leia.next();
		System.out.println("Numero da casa: ");
		int numeroCasa = leia.nextInt();
		System.out.println("CEP: ");
		int cep = leia.nextInt();
		Cadastro c1 = new Cadastro(Nome,Idade , ID,  Rua,numeroCasa, cep);
		
		Animal dog1 = new Animal("cachorro", "macho","Joaquim","SRD",2,"preto");
		Animal dog2 = new Animal("cachorro","macho","Charles","SRD", 1, "marrom");
		Animal dog3 = new Animal("cachorro","macho","Alfredo","Poodle", 4, "branco");
		Animal cat1 = new Animal("gato","fêmea","Lilica","SRD",2,"preto e branco");
		Animal cat2 = new Animal("gato","macho","Tom","SRD",1,"preto");
		System.out.println("\n************************************************");
		System.out.println("Verifique os animais disponíveis: ");
		System.out.println("**************************************************");

		dog1.animal();
		dog2.animal();
		dog3.animal();
		cat1.animal();
		cat2.animal();
		
	}
	
	}

	
