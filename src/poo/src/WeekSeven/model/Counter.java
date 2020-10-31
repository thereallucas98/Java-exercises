package WeekSeven.model;

public class Counter extends Employee {
	private String accountingBoard;
	private boolean isContabil;

	public Counter(String accountingBoard, boolean isContabil, String name, String idEmployee, String birth, boolean taxSalary, char sex) {
		super(name, idEmployee, birth, taxSalary, sex);
		this.accountingBoard = accountingBoard;
		this.isContabil = isContabil;
	}
	
	// METHDOS
	
	// GETTERS
	public String getAccoutingBoard() {
		return this.accountingBoard;
	}
	
	public boolean getIsContabil() {
		return this.isContabil;
	}
		
	// SETTERS
	public void setAccoutingBoard(String newId) {
		this.accountingBoard = newId;
	}
	
	@Override
	// TOSTRING()
	public String toString() {
		if (this.isContabil == true) {
			return String.format("NOME: %s - Nº de Inscrição do CC: %s, logo é contador(a).", getName(), this.accountingBoard);
		} else {
			return String.format("NOME: %s - ainda não é membro do Conselho.", getName());
		}
	}
	
}
