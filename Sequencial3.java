/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
	e mostre-o expresso em horas, minutos e segundos.*/

package ExerciciosJava;

import java.util.Scanner;

public class Sequencial3 {
	
	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQuantas horas durou o evento? ");
		horas = leia.nextInt();
		
		minutos = horas * 60;
		segundos = minutos * 60 ;
		
		System.out.printf("\nO evento durou "+ horas+ " horas, "+ minutos+ " minutos e "+ segundos+" segundos.");
		
	}

}
