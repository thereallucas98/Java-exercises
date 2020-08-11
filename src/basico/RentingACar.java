package basico;

import java.util.Scanner;

public class RentingACar {

	public static void main(String[] args) {
		// Programa para determinar o valor do aluguel de um carro através de:
		// KM percorridos;
		// Quantidade de dias alugado;
		// Sabe-se que o aluguel diário é R$60 reais e R$0.15 por KM rodado.
		
		Scanner entryData = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de dias de aluguel: ");
		int days = entryData.nextInt();
		
		System.out.println("Informe a quantidade de KM rodados: ");
		double km = entryData.nextDouble();
		
		double totalValue = days * km + (km * 0.15);
		
		System.out.printf("Por {%d} dia(s) rodados com {%.1f} percorridos.\nO valor a ser pago é de {%.2f}",
				days, km, totalValue);
		
		entryData.close();
	}
}
