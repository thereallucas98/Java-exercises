package WeekEight.ExerciseOne.model;

public class Administrative extends Assistent {

	private boolean shift;
	
	public Administrative() {}
	
	public Administrative(String name, String office, int age, float salary, String iD, boolean shift) {
		super(name, office, age, salary, iD);
		
		this.shift = shift;
	}
	
	// GETTERS
	public boolean getShift() {
		return this.shift;
	}
	
	
	// SETTERS
	public void setShift(boolean newShift) {
		this.shift = newShift ? true : false;
	}
	
	// TO STRING
	@Override
	public String toString() {
		if (this.shift == true) {
			return String.format("DADOS DO(A) FUNCIONÁRIO(A): "
					+ "\nNOME: %s - IDADE: %d\nFUNÇÃO: %s - SALÁRIO: %.2f\n"
					+ "MATRICULA: %s - HORÁRIO: DIURNO\n", getName(), getAge(), getOffice(), getSalary(), getId());
		} else {
			return String.format("DADOS DO(A) FUNCIONÁRIO(A): "
					+ "\nNOME: %s - IDADE: %d\nFUNÇÃO: %s - SALÁRIO: %.2f\n"
					+ "MATRICULA: %s - HORÁRIO: NOTURNO\n", getName(), getAge(), getOffice(), getSalary(), getId());
		}
		
	}
	
	
}
