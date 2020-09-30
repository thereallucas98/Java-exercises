package WeekThree.application;

import WeekThree.entities.Database;

import java.util.HashMap;


public class Suap {
	public static void main(String[] args) {
		HashMap<Database, Integer> suapIFPB = new HashMap<Database, Integer>();
		
		Database p1 = new Database("20171380013", "David Lucas");
		Database p2 = new Database("20171380012", "Mauricio");
		
		
		suapIFPB.put(p1, 1);
		suapIFPB.put(p2, 2);
		
		for (Database person : suapIFPB.keySet()) {
			System.out.printf("Dados: \n" + person + "\n", suapIFPB.get(person));
		}

		
		
	}
}
