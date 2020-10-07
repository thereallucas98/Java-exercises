package WeekFour.exerciseOne.application;

import WeekFour.exerciseOne.entities.Employe;
import WeekFour.exerciseOne.entities.SystemCompany;

public class Main {
	public static void main(String[] args) {
		Employe newEmployee = new Employe("David Lucas", "083 12345-6789", 22);
		SystemCompany company = new SystemCompany(2, "Desenvolvedor", "22/04/2021", 2400.50, newEmployee);
		
		System.out.println(company);
	}

}
