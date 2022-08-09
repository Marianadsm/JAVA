/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/


package ExerciciosJava;

import java.util.Scanner;

public class FOR2 {

	public static void main(String[] args) {
		
		int x, numero,somaNumero=0,quantPar=0,quantImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=1; x<=10; x++) {
		
		System.out.println("Entre com o número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			quantPar++;
		}
		else if(numero % 2 != 0) {
			quantImpar++;
			
		}
		}
		System.out.println("\nA quantidade de números pares é: "+quantPar);
		System.out.println("\nA quantidade de números ímpares é: "+quantImpar);

	}

}

