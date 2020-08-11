package basico;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		final double fahrenheit = 32;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double convert = (celsius * 9 / 5) + fahrenheit;
		
		System.out.println("Resultado em Fahrenheint: " + convert);
		
		entrada.close();
	}
}
