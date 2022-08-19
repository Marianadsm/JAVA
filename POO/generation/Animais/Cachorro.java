package POO.model;

import POO.model.Animal;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void emitirSom() {
		System.out.println("O cachorro late");
	}
	public void correr() {
	System.out.println("O cachorro corre");
}
	@Override
	public void visualize() {
		System.out.println("O nome do animal é: "+this.nome);
		System.out.println("A idade do animal é:"+this.idade);
	}
}
