package WeekTwo;

public class exerciseOwner {

	private String name;
	private String cpf;
	private String rg;
	private String birth;
	private exerciseOwnerAddress address;
	
	// CONSTRUCTOR
	
	public exerciseOwner(String name, String cpf, String rg, String birth, exerciseOwnerAddress address) {
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.birth = birth;
		this.address = address;
	}
	
	// METHODS
	
	// GET
	public String getName() {
		return this.name;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public exerciseOwnerAddress getAddress() {
		return this.address;
	}
	// SET
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setCpf(String newCpf) {
		this.cpf = newCpf;
	}
	
	public void setRg(String newRg) {
		this.rg = newRg;
	}
	
	public void setBirth(String newBirth) {
		this.birth = newBirth;
	}
	
	public void setAddress(exerciseOwnerAddress newAddress) {
		this.address = newAddress;
	}
	
	
	// RETURN
	public String toString() {
		return String.format("NOME: %s - RG: %s - CPF: %s\n"
				+ "DATA DE NASCIMENTO: %s\n"
				+ "%s", this.name, this.rg, this.cpf, this.birth, this.address);
	}
}
