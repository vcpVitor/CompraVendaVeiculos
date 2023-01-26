package Plataforma;

public class Carro extends Veiculo {
	public Carro() {};
	private int numPortas;
	private String carroceria;
	
	public Carro(int capacidadePessoas, String nome, int numeroRodas, String tipoCombustivel, int visitas,
			int preco, int km, int ano, String marca,
			int numPortas, String carroceria) {
		super(capacidadePessoas, nome, numeroRodas, tipoCombustivel, visitas, preco, km, ano, marca);
		this.numPortas = numPortas;
		this.carroceria = carroceria;
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumRodas(int numPortas) {
		this.numPortas = numPortas;
	}
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}
	
	

}
