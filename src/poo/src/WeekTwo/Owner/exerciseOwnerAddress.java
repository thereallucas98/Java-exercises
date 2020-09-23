package WeekTwo.Owner;

public class ExerciseOwnerAddress {

	private String street;
	private int number;
	private String neighbor;
	private String city;
	private String state;
	private String cep;
	
	// CONSTRUCTOR
	
	public ExerciseOwnerAddress(String street, int number, String neigh, String city, String state, String code) {
		this.street = street;
		this.number = number;
		this.neighbor = neigh;
		this.city = city;
		this.state = state;
		this.cep = code;
	}
	
	// METHDOS
	
	// GET
	public String getStreet() {
		return this.street;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getNeighbor() {
		return this.neighbor;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public String getCep() {
		return this.cep;
	}
	// SET
	
	public void setStreet(String newStreet) {
		this.street = newStreet;
	}
	
	public void setNumber(int newNumber) {
		this.number = newNumber;
	}
	
	public void setNeighbor(String newNeighbor) {
		this.neighbor = newNeighbor;
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}
	
	public void setState(String newState) {
		this.state = newState;
	}
	
	public void setCep(String newCep) {
		this.cep = newCep;
	}
	
	
	// RETURN
	
	public String toString() {
		return String.format("\nRUA: %s Nº%d, %s - %s - %s", this.street, this.number, this.city, this.state, this.cep);
	}
}
