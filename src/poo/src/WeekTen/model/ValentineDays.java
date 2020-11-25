package WeekTen.model;

public class ValentineDays extends WebCard {
	public ValentineDays(String recipient) {
		super(recipient);
	}
	
	@Override
	public void showMessage() {
		System.out.printf("À %s, \n"
				+ "FELIZ DIA DOS NAMORADOS", this.getRecipient());
	}
}
