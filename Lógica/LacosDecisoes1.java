//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package ExerciciosJava;

import java.util.Scanner;

public class LacosDecisoes1 {

	public static void main(String[] args) {
		int maiorNumero=0,x,y=0;
		Scanner leia = new Scanner(System.in);
		for (x=1; x<=3;x++) {
			System.out.println("Entre com o número: ");
			y = leia.nextInt();
			
			if(y > maiorNumero) {
				maiorNumero = y;
				} //dentro do laço PARA
		}
		
			
			System.out.println("O maior número é: "+maiorNumero);
		

	}
	

}
