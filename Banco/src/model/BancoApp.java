package model;

public class BancoApp {

	private String nomeBanco;
	private String agencia;
	private String cidade;
	private boolean ativo;
	
	private String mensagem;
	
	public String getNomeBanco(){
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getAgencia(){
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getCidade(){
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
		if(this.ativo) {
			mensagem = "aberto";
		}else {
			mensagem = "feachado";
		}
	}
	public void Worker() {
		System.out.println("Nome do Banco: " + nomeBanco);
		System.out.println("Nome da agencia: " + agencia);
		System.out.println("Nome de Cidade: " + cidade);
		System.out.println("O Banco está " + mensagem);
	}

	public static void main(String[] args) {
		BancoApp b1 = new BancoApp();
		b1.setNomeBanco("Banco do Brasil");
		b1.setAgencia("Afilhada um");
		b1.setCidade("Pacatuba");
		b1.setAtivo(true);
		
		b1.Worker();
		
		Conta c1 = new Conta();
		c1.setNumero(101);
		c1.setTitular("Carlos");
		c1.setSaldo(200.00);
		c1.setLimite(400.00);
		
		c1.Worker();
		
		Cliente c2 = new Cliente();
		c2.setNome("Carlos");
		c2.setMatricula("Desde de 2024");
		c2.setCurso("Informatica");
		c2.setIdade(16);
		
		c2.Worker();
		

	}

}
