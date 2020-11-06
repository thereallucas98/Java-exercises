package WeekEight.ExerciseFour.view;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int option = 0;
		
		option = Integer.parseInt(JOptionPane.showInputDialog("Opção de compra: "
				+ "\n1. Imóvel novo"
				+ "\n2. Imóvel usado"));
	}
}
