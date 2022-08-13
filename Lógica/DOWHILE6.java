/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package ExerciciosJava.JAVA;

import java.util.Scanner;

public class DOWHILE6 {

	public static void main(String[] args) {
		
		int numero,somaNum=0,quantNum=0;
		double media=0.0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Insira o número");
			numero = leia.nextInt();
		
		
		if (numero % 3 == 0 && numero!=0) {
			somaNum += numero;
			quantNum++;
			media = (somaNum/quantNum);
		}
		}
		while (numero!=0);
		
		System.out.println("\n(A média dos números múltiplos de 3 é: "+ media);
		

		
		
		
		

}
}