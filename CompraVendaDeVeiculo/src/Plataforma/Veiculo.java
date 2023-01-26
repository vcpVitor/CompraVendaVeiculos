package Plataforma;

public abstract class Veiculo {
	protected int capacidadePessoas;
	protected String nome;
	protected int numeroRodas;
	protected String tipoCombustivel;
	protected int visitas;
	protected int preco;
	protected int km;
	protected int ano;
	protected String marca;
	protected boolean vendido;
	protected Vendedor vendedor;
	protected String imagem;
	public Veiculo() {};
	
	public Veiculo(int capacidadePessoas, String nome, int numeroRodas, String tipoCombustivel, int visitas,
			int preco, int km, int ano, String marca) {
		this.capacidadePessoas = capacidadePessoas;
		this.nome = nome;
		this.numeroRodas = numeroRodas;
		this.tipoCombustivel = tipoCombustivel;
		this.visitas = visitas;
		this.preco = preco;
		this.km = km;
		this.ano = ano;
		this.marca = marca;
		this.vendido = false;
		this.vendedor = null;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String toString(){
		return "Marca: " + marca + "\nAno: " + ano + "\nPreco: " + preco + "\n\nVendedor: \n" + vendedor;
	}
	
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}
	
	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	
	public String getTipoCombsutivel() {
		return tipoCombustivel;
	}
	
	public void setTipoCombsutivel(String tipoCombsutivel) {
		this.tipoCombustivel = tipoCombsutivel;
	}
	
	public int getVisitas() {
		return visitas;
	}
	
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getImagem() {
		return imagem;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public boolean isVendido() {
		return vendido;
	}
	
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}
