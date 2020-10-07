package WeekFour.exerciseOne.entities;

public class SystemCompany {
	
	private int idEmployee;
	private String office;
	private String entry;
	private Double tax;
	private Employe person;
	
	
	// CONSTRUCTOR
	public SystemCompany(int idEmployee, String office, String entry, Double tax, Employe person) {
		this.idEmployee = idEmployee;
		this.office = office;
		this.entry = entry;
		this.tax = tax;
		this.person = person;		
	}
	
	// METHODS
	
	// GET
	public int getIdEmployee() {
		return this.idEmployee;
	}
	
	public String getOffice() {
		return this.office;
	}
	
	public String getEntry() {
		return this.entry;
	}
	
	public Double getTax() {
		return this.tax;
	}
	
	public Employe getPerson() {
		return this.person;
	}
	
	// SET
	public void setIdEmployee(int newId) {
		this.idEmployee = newId;
	}
	
	public void setOffice(String newPosition) {
		this.office = newPosition;
	}
	
	public void setEntry(String newEntry) {
		this.entry = newEntry;
	}
	
	public void setTax(Double newSalary) {
		this.tax = newSalary;
	}
	
	public void setEmployee(Employe newPerson) {
		this.person = newPerson;
	}
	// TO STRING
	public String toString() {
		return String.format("ID: %d"
				+ "\nDADOS DO FUNCIONÁRIO: %s\nCARGO: %s"
				+ "\nSALÁRIO: %.2f\nDATA DE ADMISSÃO: %s", this.idEmployee, this.person, this.office, this.tax, this.entry);
	}
}
