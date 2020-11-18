package WeekNine.ExerciseOne.view;

import WeekNine.ExerciseOne.model.Employee;
import WeekNine.ExerciseOne.model.Journey;

public class Main {
	public static void main(String[] args) {
		Employee func1 = new Employee("David Lucas", "Professor", 22, 3500, 0);

		Journey start = new Journey(40, 45);

		System.out.println(func1);

		func1.working(start);

		System.out.println(func1);
	}
}
