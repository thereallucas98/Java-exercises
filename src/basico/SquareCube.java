package basico;

import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double value = entrada.nextDouble();
		
		double square = Math.pow(value, 2);
		
		double cube = Math.pow(value, 3);
		
		System.out.printf("O valor ao quadrado é: %.0f.\nO valor ao cubo é: %.0f", square, cube);
		
		entrada.close();
	}
}
