package WeekTen.model;

public class MerryChristmas extends WebCard {
	
	public MerryChristmas(String recipient) {
		super(recipient);
	}
	
	
	@Override
	public void showMessage() {
		System.out.printf("� %s, \n"
				+ "FELIZ NATAL PARA VOC� E SUA FAMILIA", this.getRecipient());
	}

}
