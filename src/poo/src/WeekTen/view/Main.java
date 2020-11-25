package WeekTen.view;

import java.util.ArrayList;

import WeekTen.model.HappyBirthday;
import WeekTen.model.MerryChristmas;
import WeekTen.model.ValentineDays;
import WeekTen.model.WebCard;

public class Main {	

	public static void main(String[] args) {
		WebCard card = new HappyBirthday("Lucas");
		MerryChristmas xmas = new MerryChristmas("David");
		ValentineDays valentine = new ValentineDays("Eloisa");
		
		
		ArrayList<WebCard> gifts = new ArrayList<WebCard>();
		
		
		gifts.add(card);
		gifts.add(xmas);
		gifts.add(valentine);
		
		
		for (int i = 0; i < gifts.size(); i++) {
			gifts.get(i).showMessage();
		}
	}
}
