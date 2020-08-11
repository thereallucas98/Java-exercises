package basico;

import java.util.Random;
import java.util.Scanner;

public class RandomChoice {

	public static void main(String[] args) {
		// Gerar um número aleátorio e tentar descobrir.
		Scanner entryData = new Scanner(System.in);
		Random random = new Random();
		
		int computerNumber = random.nextInt(5);
		
		System.out.println("Qual foi o número pensado entre 0 e 10 do computador?");
		int userNumber = entryData.nextInt();
		
		if (userNumber == computerNumber) {
			System.out.println("Parabéns! Você conseguiu adivinhar o número.");
		} else if (userNumber != computerNumber) {
			System.out.println("Você errou! Tente mais uma vez: ");
			int userLastTry = entryData.nextInt();
			
			if (userLastTry == computerNumber) {
				System.out.println("Finalmente acertou! Parabéns!");
			} else {
				System.out.println("Peeeeerdeu!");
			}
		}
		
		
		entryData.close();		
	}
}
