package WeekEight.ExerciseThree.view;

import javax.swing.JOptionPane;

import WeekEight.ExerciseThree.model.CamaroteInferior;
import WeekEight.ExerciseThree.model.CamaroteSuperior;
import WeekEight.ExerciseThree.model.Normal;

public class Main {

	public static void main(String[] args) {
		int isVip = 0;
		
		
		isVip = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de ingresso: "
				+ "\n1. Normal"
				+ "\n2. VIP"));
		
		
		if (isVip == 1) {
			Normal ticket = new Normal(100);
			
			JOptionPane.showMessageDialog(null, "Valor do ingresso: " + ticket.getValorReais());
		} else {
			int whatKind = Integer.parseInt(JOptionPane.showInputDialog("Local: "
					+ "\n1. Camarote Superior"
					+ "\n2. Camarote Inferior"));
			
			if (whatKind == 1) {
				CamaroteSuperior superiorTicket = new CamaroteSuperior(100, 5.0);
				JOptionPane.showMessageDialog(null, superiorTicket.toString());
			} else if (whatKind == 2) {
				String local = JOptionPane.showInputDialog("Informe o setor");
				CamaroteInferior inferiorTicket = new CamaroteInferior(100, 2.5);
				inferiorTicket.setLocalizaçaoIn(local);
				JOptionPane.showMessageDialog(null, "Local: " + inferiorTicket.toString() + inferiorTicket.valorCS());
			} else {
				return;
			}
		}
	}
}
