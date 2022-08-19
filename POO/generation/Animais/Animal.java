package POO.model;

public class Animal {

		String nome;
		int idade;
		;
		
		public Animal(String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
			
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
		
		public void emitirSom() {
		
	}
		public void visualize() {
			System.out.println("O nome do animal é: "+this.nome);
			System.out.println("A idade do animal é:"+this.idade);
		}
		
}
		
	



