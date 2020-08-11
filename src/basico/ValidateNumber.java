package basico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidateNumber {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner entry = new Scanner(System.in);
		
		float values[] = new float[2];
		float division;
		int count = 0;
		
		while(count < 2) {
			System.out.println("Informe o valor: ");
			values[count] = entry.nextFloat();
			
			if (values[count] == 0) {
				System.out.println("Número inválido [zero], informe novo número: ");
				values[count] = entry.nextFloat();
			}
			
			count += 1;
		}
		
		division = values[0] / values[1];
		
		System.out.println("O resultado entre" + values[0] + " e " + values[1] + " é igual a: " + df.format(division));
		
		entry.close();
	}
}
