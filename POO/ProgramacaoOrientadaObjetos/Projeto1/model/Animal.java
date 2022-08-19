package Projeto1.model;

public class Animal {
	
	String animal;
	String sexo;
	String nome;
	String raça;
	int idade;
	String cor;
	public Animal(String nome, String raça, int idade, String cor) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.raça = raça;
		this.idade = idade;
		this.cor = cor;
	}
	public String getAnimal() {
		return animal;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public Animal(String animal, String sexo, String nome, String raça, int idade, String cor) {
		super();
		this.animal = animal;
		this.nome = nome;
		this.raça = raça;
		this.idade = idade;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void animal() {
		
	
	System.out.println("\nNome do animal: "+this.nome);
	System.out.println("Idade do animal: "+this.idade);
	System.out.println("Raça do animal:"+this.raça);
	System.out.println("Cor do animal: "+this.cor);
	System.out.println("\n************************************************");

	
}

}
