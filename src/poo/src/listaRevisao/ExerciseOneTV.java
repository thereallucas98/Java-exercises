package listaRevisao;

public class ExerciseOneTV {
	private boolean status = false;
	private int channel;
	private int volume = 50;
	
	// CONSTRUCTOR
	
	public ExerciseOneTV(boolean status, int channel, int volume) {
		this.status = status;
		this.channel = channel;
		this.volume = volume;
	}
	
	
	// METHODS
	
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
		 this.status = (this.status) ? (false) : (true);
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
			return "OBJETO N�O CRIADO";
		}
	}
}	
