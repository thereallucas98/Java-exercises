package basico;

import java.util.Random;
import java.util.Scanner;

public class RandomChoice {

	public static void main(String[] args) {
		// Gerar um n�mero ale�torio e tentar descobrir.
		Scanner entryData = new Scanner(System.in);
		Random random = new Random();
		
		int computerNumber = random.nextInt(5);
		
		System.out.println("Qual foi o n�mero pensado entre 0 e 10 do computador?");
		int userNumber = entryData.nextInt();
		
		if (userNumber == computerNumber) {
			System.out.println("Parab�ns! Voc� conseguiu adivinhar o n�mero.");
		} else if (userNumber != computerNumber) {
			System.out.println("Voc� errou! Tente mais uma vez: ");
			int userLastTry = entryData.nextInt();
			
			if (userLastTry == computerNumber) {
				System.out.println("Finalmente acertou! Parab�ns!");
			} else {
				System.out.println("Peeeeerdeu!");
			}
		}
		
		
		entryData.close();		
	}
}
