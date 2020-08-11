package basico;

import java.util.Scanner;

public class FahrenheintToCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		Double convert = (fahrenheit - 32) * 5 / 9;
		
		System.out.printf("Resutado em Celsius: %.2f", convert);
		
		entrada.close();
	}
}
