package Plataforma;

public class Venda {
	private int id;
	private Comprador comprador;
	private Veiculo veiculo;
	
	public Venda(int id, Comprador comprador, Veiculo veiculo){
		this.id = id;
		this.comprador = comprador;
		this.veiculo = veiculo;
	}
	
	public String toString(){
		return "ID: " + id + "\nComprador: \n" + comprador + "\n\nVeiculo: \n" + veiculo;
		
	}
	
	public int getId() {
		return id;
	}
	
	public Comprador getComprador() {
		return comprador;
	}
	
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
