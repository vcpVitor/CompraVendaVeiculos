package Plataforma;

public class Moto extends Veiculo{
	private int cilindrada;
	
	public Moto(int capacidadePessoas, String nome, int numeroRodas, String tipoCombustivel, int visitas,
			int preco, int km, int ano, String marca, int cilindrada) {
		super(capacidadePessoas, nome, numeroRodas, tipoCombustivel, visitas, preco, km, ano, marca);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
