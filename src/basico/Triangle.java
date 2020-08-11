package basico;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Base: ");
		double base = entry.nextDouble();
		
		System.out.println("Altura: ");
		double height = entry.nextDouble();
		
		double area = (base * height);
		
		System.out.printf("A Área do Triângulo é: %.0f", area);
		
		entry.close();
	}
}
