package WeekSeven.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JOptionPane;

import WeekSeven.model.Employee;
import WeekSeven.model.Counter;
import WeekSeven.model.Professor;
import WeekSeven.model.Coordinator;


public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Employee> Employees = new HashMap<String, Employee>();
		
		int optionMenu = 1;
		Random rand = new Random();
		
		int randomId = rand.nextInt(10000000);
		
		System.out.println(randomId);
		
		while(optionMenu != 0) {
			int optionToBeChosen = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Funcionário"
					+ "\n1. Adicionar"
					+ "\n2. Buscar"
					+ "\n3. Remover"
					+ "\n4. Listar todos"
					+ "\n0. Sair"));
			
			switch(optionToBeChosen) {
			case 1:
				String newName = JOptionPane.showInputDialog("Informe o nome do(a) funcionário(a)");
				String newId = Integer.toString(randomId);
				String newBirth = JOptionPane.showInputDialog("Informe a data de nascimento: dd/mm/aaaa");
				String answer = JOptionPane.showInputDialog("O(A) funcionário(a) irá receber salário (S/N)");
				String newSex = JOptionPane.showInputDialog("Sexo: (F/M)");

				boolean answerToBoolean = answer.equalsIgnoreCase("S") ? true : false;
				
				JOptionPane.showMessageDialog(null, newId);
				
				int secondaryOption = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar funcionário(a) como: "
						+ "\n1. Professor Substituto"
						+ "\n2. Contador"
						+ "\n3. Professor Efetivo"
						+ "\n4. Coordenador"));
				
				if (secondaryOption == 1) {
					
					
					Employee newEmployee = new Employee(newName, newId, newBirth, answerToBoolean, newSex.charAt(0));
					Employees.put(newEmployee.getIdEmployee(), newEmployee);
				} else if (secondaryOption == 2) {
					
					String accountBoard = JOptionPane.showInputDialog("Nº Inscrição no Conselho de Contabilidade");
					String answerNumberTwo = JOptionPane.showInputDialog("O(A) funcionário(a) executa contabilidade: (S/N)");
					
					boolean contabilBoolean = answerNumberTwo.equalsIgnoreCase("S") ? true : false;
					
					Counter newCounter = new Counter(accountBoard, contabilBoolean, newName, newId, newBirth, answerToBoolean, 
							newSex.charAt(0));
					
					Employees.put(newCounter.getIdEmployee(), newCounter);
					
				} else if (secondaryOption == 3){
					
					String answerNumberThree = JOptionPane.showInputDialog("O(A) professor(a) irá lecionar: (S/N)");
					boolean teaching = answerNumberThree.equalsIgnoreCase("S") ? true : false;
					Float hours = answerNumberThree.equalsIgnoreCase("N") ? 0 : Float.parseFloat(JOptionPane.showInputDialog("Informe "
							+ "a quantidade de aulas por semana"));
					
					Professor newProfessor = new Professor(hours, teaching, newName, newId, newBirth, answerToBoolean, 
							newSex.charAt(0));
					
					Employees.put(newProfessor.getIdEmployee(), newProfessor);
					
				} else if (secondaryOption == 4) {
					
					String ocupation = JOptionPane.showInputDialog("Ocupação do coordenador");
					String creating = JOptionPane.showInputDialog("Coordenador pode criar turmas: (S/N)");
					String answerNumberThree = JOptionPane.showInputDialog("O(A) professor(a) irá lecionar: (S/N)");
					boolean teaching = answerNumberThree.equalsIgnoreCase("S") ? true : false;
					Float hours = answerNumberThree.equalsIgnoreCase("N") ? 0 : Float.parseFloat(JOptionPane.showInputDialog("Informe "
							+ "a quantidade de aulas por semana"));
					
					boolean isCreating = creating.equalsIgnoreCase("S") ? true : false;
					
					Coordinator newCoordinator = new Coordinator(hours, teaching, newName, newId, newBirth, answerToBoolean, 
							newSex.charAt(0), ocupation, isCreating);
					
					Employees.put(newCoordinator.getIdEmployee(), newCoordinator);
					
				} else {
					System.out.println("Opção Inválida");
				}
				
				break;
			case 2: 
				String searchId = JOptionPane.showInputDialog("Informe o ID");
				
				System.out.println(Employees.get(searchId));
				break;
			case 4:
				for(@SuppressWarnings("rawtypes") Map.Entry emp : Employees.entrySet()) {
					System.out.println(emp.getValue());
				}
				break;
			case 0:
				optionMenu = 0;
				break;
			}
		}
		
	}
}
