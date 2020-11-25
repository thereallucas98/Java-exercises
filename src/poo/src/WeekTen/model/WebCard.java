package WeekTen.model;

public abstract class WebCard {
	private String recipient;
	
	public WebCard() {}
	
	public WebCard(String recipient) {
		this.recipient = recipient;
	}
	
	public String getRecipient() {
		return this.recipient;
	}
	
	public void setRecipient(String neew) {
		this.recipient = neew;
	}
	
	public abstract void showMessage();
}
