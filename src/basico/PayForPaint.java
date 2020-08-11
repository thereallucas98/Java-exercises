package basico;

import java.util.Scanner;

public class PayForPaint {

	public static void main(String[] args) {
		// Programa para ler a largura e altura (em metros) de uma parede
		// Calcular a �rea e a quantidade de tinta necess�ria para pint�-la.
		// Considerando que cada litro de tinta, cobre uma �rea de 2m quadrados.
		
		Scanner entryData = new Scanner(System.in);
		
		System.out.println("Digite a largura da parede: ");
		double width = entryData.nextDouble();
		
		System.out.println("Digite a altura da parede: ");
		double height = entryData.nextDouble();
		
		double area = width * height;
		
		double amount = area / 2;
		
		
		System.out.printf("\nSua parede tem uma dimens�o de {%.0f}x{%.0f}. E sua �rea � de "
				+ "{%.2f}m quadrados.", width, height, area);
		System.out.printf("\nPara pintar a sua parede, ser� necess�rio{ {%.1f} de tinta", amount);
		
		
		entryData.close();
	}
}
