package POO.model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Preguica p1 = new Preguica("Preguicosa", 2);
Cavalo c1 = new Cavalo ("Alipio", 5);
Cachorro ca = new Cachorro("Marley", 6);

p1.visualize();
c1.visualize();
ca.visualize();
p1.emitirSom();
ca.emitirSom();
c1.emitirSom();
}
}
