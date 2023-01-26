package Plataforma;

public class Comprador extends Pessoa{
	
	public Comprador(String nome, int cpf, int telefone, String endereco) {
		super(nome, cpf, telefone, endereco);
	}
		
	
	public boolean comprarVeiculo() {
		return false;
	}
}
