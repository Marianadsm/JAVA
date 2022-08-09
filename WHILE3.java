/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package ExerciciosJava;

import java.util.Scanner;

public class WHILE3 {

	public static void main(String[] args) {
	
		int idade=0,menos=0,mais=0;
		
		while (idade <=99) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		
		if(idade < 21) {
			menos++;
		}else if (idade > 50) {
			mais++;
		}
		
		}
		System.out.println("\nA quantidade de pessoas com menos de 21 anos é: "+menos);
		System.out.println("\nA quantidade de pessoas com mais de 50 anos é: "+mais);
		
	}

}
