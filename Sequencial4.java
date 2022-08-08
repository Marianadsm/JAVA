//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 

package ExerciciosJava;

import java.util.Scanner;

public class Sequencial4 {

	public static void main(String[] args) {
		
		int a,b,c;
		double d,r,s;
		
		Scanner leia = new Scanner (System.in);
	
		System.out.println("Entre com o número para A: ");
		a = leia.nextInt();
		System.out.println("Entre com o número para B: ");
		b = leia.nextInt();
		System.out.println("Entre com o número para C: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);	
		s= (b+c)*(b+c);
		
		d= (r+s)/2;
		System.out.println("O valor de D é"+ d+ ".");

	}

}
