//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package ExerciciosJava;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		
		int[][]numero = new int [3][3];
		int x,y,maior10=0;
		
				Scanner leia = new Scanner(System.in);
				
				for (x=0; x<3; x++){
					for (y=0; y<3; y++) {
						System.out.println("Entre com o número: ");
						numero[x][y] = leia.nextInt();
					
				if(numero[x][y]>10) {
					maior10++;
					
				}
					}
				}
				System.out.println("A quantidade de números maior que 10 é: "+maior10);
				
	}

}
