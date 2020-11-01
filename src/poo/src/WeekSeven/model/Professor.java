package WeekSeven.model;

public class Professor extends Employee {
	private Float hoursTeaching;
	private boolean isTeaching;
	
	public Professor(float hoursTeaching, boolean isTeaching, String name, String idEmployee, String birth, boolean taxSalary, char sex) {
		super(name, idEmployee, birth, taxSalary, sex);
		this.hoursTeaching = hoursTeaching;
		this.isTeaching = isTeaching;
	}
	
	// METHODS
	
	// GETTERS
	public Float getHourTeaching() {
		return this.hoursTeaching;
	}
	
	public boolean getIsTeaching() {
		return this.isTeaching;
	}
	
	// SETTERS
	public void setHoursTeaching(float update) {
		this.hoursTeaching = update;
	}
	
	public void setIsTeaching(boolean isTrue) {
		if (this.isTeaching == false) {
			this.isTeaching = true;
		} else {
			this.isTeaching = false;
		}
	}
	
	@Override
	// TOSTRING()
	public String toString() {
		if (this.isTeaching == true) {
			return String.format("\nDADOS DO FUNCIONÁRIO: "
					+ "NOME: %s - HORAS/AULA: %.1f e no momento está lecionando", getName(), this.hoursTeaching);
		} else {
			return String.format("\nDADOS DO FUNCIONÁRIO: "
					+ "\nNOME: %s - MATRICULA: %s e no momento não está lecionando", getName(), getIdEmployee());
		}
	}
}
