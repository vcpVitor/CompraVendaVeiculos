package Plataforma;

public class Caminhao extends Veiculo {
	private int numPortas;
	private int capacidadeDeCarga;
	
	public Caminhao(int capacidadePessoas, String nome, int numeroRodas, String tipoCombustivel, int visitas,
			int preco, int km, int ano, String marca, int numPortas, int capacidadeDeCarga) {
		super(capacidadePessoas, nome, numeroRodas, tipoCombustivel, visitas, preco, km, ano, marca);
		this.numPortas = numPortas;
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}
	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	

}
