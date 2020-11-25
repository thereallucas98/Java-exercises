package WeekTen.model;

public class MerryChristmas extends WebCard {
	
	public MerryChristmas(String recipient) {
		super(recipient);
	}
	
	
	@Override
	public void showMessage() {
		System.out.printf("À %s, \n"
				+ "FELIZ NATAL PARA VOCÊ E SUA FAMILIA", this.getRecipient());
	}

}
