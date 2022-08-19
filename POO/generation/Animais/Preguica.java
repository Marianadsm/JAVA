package POO.model;

import POO.model.Preguica;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super (nome, idade);
	}
	public void emtirSom() { 
		System.out.println("A preguiça está emitindo sons de alta-frequência");
	}
	
	public void subirArvore() {
	System.out.println("A preguiça sobe na árvore");
}
	
	@Override
	public void visualize() {
		System.out.println("O nome do animal é: "+this.nome);
		System.out.println("A idade do animal é:"+this.idade);
	}
}
