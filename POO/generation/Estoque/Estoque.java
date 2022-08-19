package Estoque;

import java.util.ArrayList;

public class Estoque {

	public static void main(String[] args) {
		
//Estoque de loja de materiais escolares
		ArrayList <String> arrayEstoque = new ArrayList <String>();
	arrayEstoque.add("\ncaneta"); //0
	arrayEstoque.add("\nlapisDeCor");//1
	arrayEstoque.add("\ncaderno");//2
	arrayEstoque.add("\nestojo");//3
	arrayEstoque.add("\nlivros");//4
	System.out.println("A lista do estoque é: "+arrayEstoque);
	System.out.println("Remover item Caderno:");
	arrayEstoque.remove(2);
	for(int x = 0; x < arrayEstoque.size();x++) {
		System.out.println(arrayEstoque.get(x));
	}
	
	
	
	
	
	
	
	
	
	}

}
