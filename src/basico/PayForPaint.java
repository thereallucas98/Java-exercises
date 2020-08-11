package basico;

import java.util.Scanner;

public class PayForPaint {

	public static void main(String[] args) {
		// Programa para ler a largura e altura (em metros) de uma parede
		// Calcular a área e a quantidade de tinta necessária para pintá-la.
		// Considerando que cada litro de tinta, cobre uma área de 2m quadrados.
		
		Scanner entryData = new Scanner(System.in);
		
		System.out.println("Digite a largura da parede: ");
		double width = entryData.nextDouble();
		
		System.out.println("Digite a altura da parede: ");
		double height = entryData.nextDouble();
		
		double area = width * height;
		
		double amount = area / 2;
		
		
		System.out.printf("\nSua parede tem uma dimensão de {%.0f}x{%.0f}. E sua área é de "
				+ "{%.2f}m quadrados.", width, height, area);
		System.out.printf("\nPara pintar a sua parede, será necessário{ {%.1f} de tinta", amount);
		
		
		entryData.close();
	}
}
