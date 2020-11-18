package WeekNine.ExerciseTwo.view;

import WeekNine.ExerciseTwo.model.Cat;
import WeekNine.ExerciseTwo.model.Dog;
import WeekNine.ExerciseTwo.model.Feed;
import WeekNine.ExerciseTwo.model.Food;

public class Main {

	public static void main(String[] args) {
		Dog myDog = new Dog(10);
		Cat myCat = new Cat(4);
		
		Food ration = new Feed(0.035); 

		System.out.println(myDog.getWeight());
		myDog.eat(ration);
		System.out.println(myDog.getWeight());
		System.out.println("=======");
		System.out.println(myCat.getWeight());
		myCat.eat(ration);
		System.out.println(myCat.getWeight());
		
	}
}
