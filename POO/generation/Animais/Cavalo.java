package POO.model;

import POO.model.Cavalo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	public void emitirSom() {
		System.out.println("O Cavalo está relinchando");
	}
	
	public void correr() {
		System.out.println("O cavalo está correndo");
	
}
	@Override
	public void visualize() {
		System.out.println("O nome do animal é: "+this.nome);
		System.out.println("A idade do animal é:"+this.idade);
	}
}
