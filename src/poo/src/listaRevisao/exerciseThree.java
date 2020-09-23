package listaRevisao;

import java.util.Random;
import javax.swing.JOptionPane;

public class ExerciseThree {
	public static void main(String[] args) {

		int menuOption = 1;
		int countSpeed = 0;
		Random rand = new Random();
		double randomFuelStart = rand.nextInt(60);

		ExerciseThreeTruck newTruck = new ExerciseThreeTruck(false, randomFuelStart, 0);
		
		System.out.println(newTruck.getFuel());
		
		while(menuOption != 0) {
			int optionToBeChosen = Integer.parseInt(JOptionPane.showInputDialog(null, "## MY TRUCK ##"
					+ "\n1. Desligar/Ligar caminhão"
					+ "\n2. Acelerar"
					+ "\n3. Diminuir velocidade"
					+ "\n4. Reabastecer (encher o tanque de 60L)"
					+ "\n5. Mostrar Status"
					+ "\n0. Sair"
					+ ""
					+ "\n Informe o que deseja fazer"));
			
			switch(optionToBeChosen) {
			case 1:
				newTruck.setStatus();
				break;
			case 2:
				int min = 5;
				int max = 15;
				int toBeIncreased = min + (int)(Math.random() * ((max - min) + 1));
				
				if (newTruck.getSpeed() == 150) {
					System.out.println("Velocidade Máxima já atingida");
				} else if (newTruck.getSpeed() <= 150) {
					newTruck.setSpeed(toBeIncreased);
				} else if (newTruck.getSpeed() >= 150) {
					System.out.println("VELOCIDADE MÁXIMA JÁ ATINGIDA");
				}
				else {
					System.out.println("Velocidade não foi incrementada por ter ultrapassado a velocidade máxima.");
				}
				
				countSpeed++;
				
				double minConsume = 0.4;
				double maxConsume = 1;
				
				double toBeConsumed = minConsume + (double)(Math.random() * ((maxConsume - minConsume) + 1));
				
				
				if (countSpeed == 8) {
					newTruck.setConsume(toBeConsumed);
					countSpeed = 0;
				} else if (countSpeed == 5) {
					newTruck.setConsume(toBeConsumed + 0.6);
				} else {
					System.out.println("");
				}
				
				break;
			case 3:
				int m = 8;
				int ma = 25;
				int toBeDecreased = m + (int)(Math.random() * ((ma - m) + 1));
				
				if (newTruck.getSpeed() == 0) {
					System.out.println("Veículo já parado!0");
				} else if (newTruck.getSpeed() > 0) {
					newTruck.setBreak(toBeDecreased);
				} else {
					System.out.println("Stoping the truck");
				}
				break;
			case 4:
				 newTruck.setFuel();
			case 5:
				JOptionPane.showMessageDialog(null, newTruck);
				break;
			case 0:
				menuOption = 0;
				break;
			}
			
		}
	}
}
