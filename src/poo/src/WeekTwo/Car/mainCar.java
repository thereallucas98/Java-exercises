package WeekTwo.Car;

import java.util.Random;

import javax.swing.JOptionPane;

public class mainCar {
	public static void main(String[] args) {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ0123456789";
		String chassi = "";
		String ownerName = "";
		String carModel = "";
		String carColor = "";
		String numberGearsCar = "";
		int menuOption = 1;
		int index = 0;
		int manualGearOption = 0;
		int numberPortsCar = 0;
		int yearCar = 0;
		int solarRoofCar = 0;
		
		
		Random random = new Random();
		car newCar = new car("", "", "", "", "", 0, 0, 0, 0, false, false, false, 0.0);
		
		// GENERATING CHASSI
		 
		for( int i = 0; i < 16; i++ ) {
		   index = random.nextInt( letras.length() );
		   chassi += letras.substring( index, index + 1 );
		}
		
		
		// CADASTRO DO COMPRADOR
		
		ownerName = JOptionPane.showInputDialog("Olá, por favor insira o nome do(a) comprador(a) ");
		carModel = JOptionPane.showInputDialog("Informe o modelo do veículo que será comprado");
		carColor = JOptionPane.showInputDialog("Informe a cor do carro");
		numberPortsCar = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de portas do veículo"));
		yearCar = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veículo: "));
		
		// 
		
		manualGearOption = Integer.parseInt(JOptionPane.showInputDialog("1. Cambio automático\n2. Cambio Manual"));
		
		
		newCar.setName(ownerName);
		newCar.setModel(carModel);
		newCar.setColor(carColor);
		newCar.setChassi(chassi);
		newCar.setNumberPorts(numberPortsCar);
		newCar.setYear(yearCar);
		
		if (manualGearOption == 1) {
			numberGearsCar = "PND";
		} else if(manualGearOption == 2) {
			numberGearsCar = JOptionPane.showInputDialog("Informe a quantidade de marchas");
		}
		
		newCar.setGears(numberGearsCar);
		
		
		System.out.println(newCar);
		System.out.println(newCar.getNumberGears());
		
		
	}
}
