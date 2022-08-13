package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		Conta c1 = new Conta (123456, "123", "CC","Mariana",1000.0f);
	c1.visualize();
	c1.sacar(150.0f);
	}

}
