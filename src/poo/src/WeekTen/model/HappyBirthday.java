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
		/*String.format("PARAB�EEEEEENS!\nDestinat�rio(a): %s\n"
				+ "FELIZ ANIVERS�RIO, TUDO DE BOM!", this.getRecipient());*/
		
		System.out.printf("� %s, \n"
				+ "FELIZ ANIVERS�RIO", this.getRecipient());
		
	}

}
