package WeekEight.ExerciseTwo.View;

import WeekEight.ExerciseTwo.Model.Miserable;
import WeekEight.ExerciseTwo.Model.Poor;
import WeekEight.ExerciseTwo.Model.Rich;

//import WeekEight.ExerciseTwo.Model.Cat;
//import WeekEight.ExerciseTwo.Model.Dog;

public class Main {

	public static void main(String[] args) {
		
		// ANIMAIS
		/*Cat newCat = new Cat("Jubileu", "Persa");
		Dog newDog = new Dog("Chewbacca", "Buldogue");
		
		
		System.out.println(newCat.Miar());
		System.out.println(newDog.Latir());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("\nCat");
			System.out.println(newCat.caminha());
			System.out.println("\nDog");
			System.out.println(newDog.caminha());
		}
		
		System.out.println("Todos estão com sede!");
		*/
		
		// PESSOAS
		Poor workGuy = new Poor("Zé", 40);
		Miserable randomGuy = new Miserable("Unknown", 0);
		Rich richOne = new Rich("Madonna", 50, 10);
		
		System.out.println(workGuy.getName());
		System.out.println(workGuy.working());
		
		System.out.println(richOne.getCash());
		richOne.goShopping(10.0);
		System.out.println(richOne.getCash());
	}
}
