package WeekThree.application;

import WeekThree.entities.Database;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Suap {
	public static void main(String[] args) {
		HashMap<String, Database> suapIFPB = new HashMap<String, Database>();
		/*
		Database p1 = new Database("20171380013", "David Lucas");
		Database p2 = new Database("20171380012", "Mauricio");
		
		
		suapIFPB.put(p1.getMatricula(), p1);
		suapIFPB.put(p2.getMatricula(), p2);
		
		for (Database person : suapIFPB.keySet()) {
			System.out.printf("Dados: \n" + person + "\n", suapIFPB.get(person));
		}
		
		for (Map.Entry people : suapIFPB.entrySet()) {
			System.out.println(" " + people.getValue());
		}

		System.out.println(suapIFPB.size());		
		System.out.println(suapIFPB.get(p1.getMatricula()));
		
		*/
		int optionMenu = 1;

		while (optionMenu != 0) {
			int optionToBeChosen = Integer.parseInt(JOptionPane.showInputDialog("SUAP IFPB - Cadastro de Aluno"
					+ "\n1. Adicionar"
					+ "\n2. Buscar"
					+ "\n3. Remover"
					+ "\n4. Listar todos"
					+ "\n0. Sair"));
			
			switch (optionToBeChosen) {
			case 1:
				String newMatricula = JOptionPane.showInputDialog("Informe a "
						+ "matrícula do(a) aluno(a)");
				String newNome = JOptionPane.showInputDialog("Informe o nome"
						+ " do(a) aluno(a)");
				
				Database newPerson = new Database(newMatricula, newNome);
				
				
				suapIFPB.put(newPerson.getMatricula(), newPerson);
				break;
			case 2:
				String searchMatricula = JOptionPane.showInputDialog("Informe a Matricula do(a) aluno(a)");
				
				
				System.out.println(suapIFPB.get(searchMatricula));
				break;
			case 3:
				String removehMatricula = JOptionPane.showInputDialog("Informe a Matricula do(a) aluno(a)");
				suapIFPB.remove(removehMatricula);
				break;
			case 4:
				for (Map.Entry people : suapIFPB.entrySet()) {
					System.out.println(people.getValue());
				}
				break;
			case 0:
				optionMenu = 0;
			}
		}
	}
}
