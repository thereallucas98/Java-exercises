package basico;

import java.util.Scanner;

public class YearToDays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de anos: ");
		double years = entrada.nextDouble();
		
		double days = years * 365;
		
		System.out.println("A quantidade de " + years + " anos em dias é: " + days);
		
		entrada.close();
	}
}
