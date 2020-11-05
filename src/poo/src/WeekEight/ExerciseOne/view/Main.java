package WeekEight.ExerciseOne.view;

import WeekEight.ExerciseOne.model.Administrative;
import WeekEight.ExerciseOne.model.Assistent;
import WeekEight.ExerciseOne.model.Employee;
import WeekEight.ExerciseOne.model.Manager;
import WeekEight.ExerciseOne.model.Tecnical;


public class Main {

	public static void main(String[] args) {
		Employee func = new Employee("David Lucas", "Desenvolvedor", 22, 1500);
		Manager mange = new Manager("Maria Rebeca", "Desenvolvedora Senior", 22, 3000, "TI");
		Assistent assis = new Assistent("Gustavo", "Técnico de Suporte", 18, 1200, "4533");
		Tecnical tecnic = new Tecnical("Gabriel", "Suporte Técnico de Redes", 18, 1150, "45453", 0.5);
		Administrative ad = new Administrative("Eloah", "Assistente Administrativo", 25, 1400, "3544", false);
		
		
		System.out.println(func);
		System.out.println(mange);
		System.out.println(assis);
		System.out.println(tecnic);
		System.out.println(ad);
	}
}
