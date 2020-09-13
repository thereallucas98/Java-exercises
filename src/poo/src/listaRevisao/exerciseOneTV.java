package listaRevisao;

public class exerciseOneTV {
	private boolean status = false;
	private int channel;
	private int volume = 50;
	
	// CONSTRUCTOR
	
	public exerciseOneTV(boolean status, int channel, int volume) {
		this.status = status;
		this.channel = channel;
		this.volume = volume;
	}
	
	
	// METODS
	
	// GET
	
	public boolean getStatus() {
		return this.status;
	}
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	
	// SET 
	
	public void setStatus() {
		 if (this.status == false)
			this.status = true;
		else
			this.status = false;
	}
	
	public void setChannel(int newChannel) {
		this.channel = newChannel;
	}
	
	public void setUpVolume() {
		this.volume += 5;
	}
	
	public void setDownVolume() {
		this.volume -= 5;
	}
	
	// RETURN 

	public String toString() {
		if (this.status == false) {
			return String.format("\n # MY TV # \n STATUS: DESLIGADA ");
		}
		else if (this.status == true) {
			return String.format("\n # MY TV # \n STATUS: LIGADA\n\nCHANNEL %d\nVOLUME: %d%", this.channel, this.volume);
		} else {
			return "OBJETO NÃO CRIADO";
		}
	}
}	
