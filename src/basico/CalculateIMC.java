package basico;

import java.util.Scanner;

public class CalculateIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Altura: ");
		double height = entrada.nextDouble();
		
		System.out.print("Peso: ");
		double weight = entrada.nextDouble();
		
		double newHeight = height * height;
		
		double imc = weight / newHeight;
		
		System.out.printf("IMC: %.2f", imc);
		
		entrada.close();
	}
}
