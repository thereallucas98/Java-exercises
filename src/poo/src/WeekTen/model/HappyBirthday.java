package WeekTen.model;

public class HappyBirthday extends WebCard {
	
	public HappyBirthday(String recipient) {
		super(recipient);
	}
	
	public String getDestine() {
		return this.getRecipient();
	}
	
	@Override
	public void showMessage() {
		/*String.format("PARABÉEEEEEENS!\nDestinatário(a): %s\n"
				+ "FELIZ ANIVERSÁRIO, TUDO DE BOM!", this.getRecipient());*/
		
		System.out.printf("À %s, \n"
				+ "FELIZ ANIVERSÀRIO", this.getRecipient());
		
	}

}
