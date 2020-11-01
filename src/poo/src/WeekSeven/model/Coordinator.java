package WeekSeven.model;

public class Coordinator extends Professor {
	private String office;
	private boolean create;
	
	public Coordinator(float hoursTeaching, boolean isTeaching, String name, 
			String idEmployee, String birth, boolean taxSalary, char sex, String office, boolean create) {
		super(hoursTeaching, isTeaching, name, idEmployee, birth, taxSalary, sex);
		this.office = office;
		this.create = create;
	}
	
	
	// METHODS
	
	// GETTERS 
	public String getOffice() {
		return this.office;
	}
	
	public boolean getCreate() {
		return this.create;
	}
	
	// SETTERS
	public void setOffice(String newOffice) {
		this.office = newOffice;
	}
	
	public void setCreate(boolean isTrue) {
		if (this.create == false) {
			this.create = true;
		} else {
			this.create = false;
		}
	}
	
	// TOSTRING()
	public String toString() {
		return String.format("\nDADOS DO COORDENADOR\nNOME: %s - DATA DE NASCIMENTO: %s"
				+ "\nFUNÇÃO: %s", getName(), getBirth(), this.office);
	}
}
