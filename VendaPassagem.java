package exercicios;

public class VendaPassagem {
	
	private int codigo;
	private String nome;
	private double renda;

	public void setCodigo(int codigo) {
		this.codigo = codigo;

	}

	public int getCodigo() {
		return this.codigo;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public double getRenda() {
		return this.renda;
	}
	
	public String toString() {
		return "Nome do cliente: " + this.nome + "\nCódigo: " 
				+ this.codigo + "\nRenda salarial: R$ " + this.renda;
	}
}
