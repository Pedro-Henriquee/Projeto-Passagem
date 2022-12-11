package exercicios;

public class CompraPassagem {
	
	private int codigo;
	private String destino;
	private String data;
	private String hora;
	private double valor;
	private double maiorValor;
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getHora() {
		return this.hora;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setMaiorValor(double maiorValor) {
		this.maiorValor = maiorValor;
	}
	
	public double getMaiorValor() {
		return this.maiorValor;
	}
	
	public String toString() {
		return "Passagem com código: " + this.codigo + "\nDestino: " + this.destino + "\nData: " + this.data + "\nHora: " + this.hora + "\nValor: " + this.valor;
	}


}
