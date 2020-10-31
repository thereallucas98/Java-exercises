package WeekSeven.model;

public class Employee {
	
	private String name;
	private String idEmployee;
	private String birth;
	private boolean taxSalary;
	private char sex;
	
	public Employee(String name, String idEmployee, String birth, boolean taxSalary, char sex) {
		this.name = name;
		this.idEmployee = idEmployee;
		this.birth = birth;
		this.taxSalary = taxSalary;
		this.sex = sex;
	}
	
	// METHODS
	
	// GETTERS
	public String getName() {
		return this.name;
	}
	
	public String getIdEmployee() {
		return this.idEmployee;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public boolean getTaxSalary() {
		return this.taxSalary;
	}
	
	public char getSex() {
		return this.sex;
	}
	
	// SETTERS
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setIdEmployee(String newId) {
		this.idEmployee = newId;
	}
	
	public void setBirth(String newDate) {
		this.birth = newDate;
	}
	
	public void setTaxSalary(boolean isTrue) {
		if (this.taxSalary == false) {
			this.taxSalary = true;
		} else {
			this.taxSalary = false;
		}
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	// TOSTRING()
	
	public String toString() {
		if (this.taxSalary == false) {
			return String.format("Dados do Funcionário: \n\nNOME: %s - "
					+ "MATRICULA: %s - DATA DE NASCIMENTO: %s - SEXO: %s"
					+ "\nFUNCIONÁRIO É PROFESSOR SUBSTITUTO(VOLUNTÁRIO).", this.name, this.idEmployee, this.birth, this.sex);
		} else {
			return String.format("Dados do Funcionário: \n\nNOME: %s - "
					+ "MATRICULA: %s - DATA DE NASCIMENTO: %s - SEXO: %s"
					+ "\nPROFESSOR EFETIVO", this.name, this.idEmployee, this.birth, this.sex);
		}
	}

	
}
