package Plataforma;

public class Catalogo {
	private Veiculo[] veiculos;
	private int capacidadeArray;
	private int count;
	
	public Catalogo(int qtdElem) {
		this.veiculos = new Veiculo[qtdElem];
		this.capacidadeArray = qtdElem;
		this.count = 0;
	}
	
	public void addVeiculo(Veiculo v) {
		this.veiculos[count] = v;
		this.count++;
	}
	
	public void print() {
		for (int i = 0; i < count; i++) { 
			System.out.println(veiculos[i]);
		}
	}
	
	public int length() {
		return count;
	}
	
	public Veiculo[] getListaVeiculos() {
		return veiculos;
	}
}