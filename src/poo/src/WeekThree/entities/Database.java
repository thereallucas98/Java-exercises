package WeekThree.entities;

public class Database {
	
	private String matricula;
	private String nome;
	
	public Database(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setMatricula(String newMatricula) {
		this.matricula = newMatricula;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	
	public String toString() {
		return String.format("Nome: %s - Matricula: %s", this.nome, this.matricula);
	}
}
