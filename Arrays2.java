/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/


package ExerciciosJava;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		
		int [] num = new int [6];
		int somaPar=0, quantImpar=0, x;
	
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0; x<6; x++) {
		System.out.println("Entre com o número ");
		num [x] = leia.nextInt();
		
		if(num [x] %2== 1) {
			quantImpar++;
			
			
		}
	
			else {
				somaPar += num [x]; //if e else sempre DENTRO do laço For
		}
		}
		System.out.println("Os números ímpares foram: " );
		for (int y=0;y<6;y++) {
			
			if (num[y]%2==1) {
		System.out.println(num[y]);
			}
		}
		
		
		System.out.println("A soma dos números pares é: "+somaPar);
		System.out.println("A quantidade de números ímpares é de: "+quantImpar);
		
		
		}
		}
	


