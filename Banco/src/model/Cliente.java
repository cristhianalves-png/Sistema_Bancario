package model;

public class Cliente {
	private String nome;
	private String matricula;
	private String curso;
	private int idade;
	
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso(){
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void Worker() {
		System.out.println("=== Aluno ===");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Nome da matricula: " + matricula);
		System.out.println("Curso: " + curso);
		System.out.println("Idade do cliente: " + idade);
		
	}
}
