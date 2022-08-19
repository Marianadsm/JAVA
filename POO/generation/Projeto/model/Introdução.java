package Projeto1.model;

import java.util.Scanner;

public class Introdução {

	public void introducao() {
	int opcao = 0;
	Scanner leia = new Scanner (System.in);
	System.out.println("BEM VINDO À ONG ANIMALS CARE!");
	System.out.println("Para adotar, digite 1");
	System.out.println("Para denúncias, digite 2:");
	opcao = leia.nextInt();
	switch (opcao) {
	case 1:
		System.out.println("\nFicamos felizes por querer adotar um amiguinho! Para continuarmos o processo, faça o cadastro: ");
		Cadastro c1 = new Cadastro(null, 0, null, null, 0, 0);
		c1.visualizeCadastro();
		break;
	case 2: 
		System.out.println("Por favor, utilize este espaço para denunciar possíveis maus-tratos, com o maior número possível de detalhes:");
		break;
	}
	
}
}