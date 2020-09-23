package listaRevisao;

import javax.swing.JOptionPane;

import listaRevisao.ExerciseOneTV;

public class ExerciseOne {
	public static void main(String[] args) {
		int menuOption = 1;
		ExerciseOneTV newTV = new ExerciseOneTV(false, 0, 0);
		

		while(menuOption != 0) {
			//JOptionPane.showMessageDialog(null, newTV.toString());
			
			JOptionPane.showMessageDialog(null, "#TV FOI LIGADA#\nMenu de Opções: "
					+ "\n1. Ligar/Desligar TV"
					+ "\n2. Aumentar Volume (Aumenta 5%)"
					+ "\n3. Diminuir Volume (Diminui 5%)"
					+ "\n4. Trocar de Canal"
					+ "\n5. Mostrar Informações da TV"
					+ "\n 0. Sair");
			
			int optionToBeChosen = Integer.parseInt(
					JOptionPane
					.showInputDialog("Informe a Opção do "
							+ "Menu apresentado anteriormente"));
			
			switch(optionToBeChosen) {
			case 1: 
				newTV.setStatus();
				break;
			case 2:
				newTV.setUpVolume();
				break;
			case 3:
				newTV.setDownVolume();
				break;
			case 4:
				int channelToBeSelect = Integer.parseInt(
						JOptionPane.showInputDialog("Informe o Cana"
								+ "l que deseja assistir (0 a 100)"));
				newTV.setChannel(channelToBeSelect);
				optionToBeChosen = 5;
				break;
			case 5:
				JOptionPane.showMessageDialog(null, newTV);
				break;
			case 0: 
				menuOption = 0;
				break;
			}
		}
	}
}
