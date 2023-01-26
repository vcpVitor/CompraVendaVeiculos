package Plataforma;
import java.util.ArrayList;

import View.JanelaPrincipal;

public class Main {
	
	private static ArrayList<Carro> carros = new ArrayList<Carro>();
	private static ArrayList<Moto> motos = new ArrayList<Moto>();
	private static ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
	

	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();
		
		Catalogo cat = gerarCatalogo();
		
		janela.addContainerCatalogo(cat);
		janela.setVisible();
	}
	
	
	static private Catalogo gerarCatalogo() {

		Vendedor v1 = new Vendedor("Wagner", 123456789, 193, "Samambaia");

		Carro c = new Carro(4, "Carro", 4, "flex", 321, 40000, 145000, 2015, "Fiat", 4, "sedan");
		c.setImagem("assets/fiat-grand-siena-2021.jpg");
		c.setVendedor(v1);
		
		Caminhao o = new Caminhao(3, "Caminhao", 8, "diesel", 123, 100000, 500000, 2020, "Volvo", 2, 45000);
		o.setImagem("assets/fiat-grand-siena-2021.jpg");
		o.setVendedor(v1);
		
		Moto h = new Moto(2, "Moto", 2, "flex", 45, 50000, 35000, 2022, "Honda", 800);
		h.setImagem("assets/fiat-grand-siena-2021.jpg");
		h.setVendedor(v1);
		
		Carro f = new Carro(4, " CARRO F", 4, "flex", 321, 40000, 145000, 2016, "Fiat", 4, "sedan");
		f.setImagem("assets/fiat-grand-siena-2021.jpg");
		f.setVendedor(v1);
		
		Carro s = new Carro(4, "CARRO S", 4, "flex", 321, 40000, 145000, 2020, "Fiat", 4, "sedan");
		s.setImagem("assets/fiat-grand-siena-2021.jpg");
		s.setVendedor(v1);
		
		Caminhao p = new Caminhao(3, "Caminhao", 8, "diesel", 123, 100000, 500000, 2020, "Volvo", 2, 45000);
		p.setImagem("assets/fiat-grand-siena-2021.jpg");
		p.setVendedor(v1);
		
		Caminhao w = new Caminhao(3, "Caminhao", 8, "diesel", 123, 100000, 500000, 2020, "Volvo", 2, 45000);
		w.setImagem("assets/fiat-grand-siena-2021.jpg");
		w.setVendedor(v1);
		
		Caminhao t = new Caminhao(3, "Caminhao", 8, "diesel", 123, 100000, 500000, 2020, "Volvo", 2, 45000);
		t.setImagem("assets/fiat-grand-siena-2021.jpg");
		t.setVendedor(v1);
		
		Caminhao q = new Caminhao(3, "Caminhao", 8, "diesel", 123, 100000, 500000, 2020, "Volvo", 2, 45000);
		q.setImagem("assets/fiat-grand-siena-2021.jpg");
		q.setVendedor(v1);
		
		Moto hq = new Moto(2, "Moto1", 2, "flex", 45, 50000, 35000, 2022, "Honda", 800);
		hq.setImagem("assets/fiat-grand-siena-2021.jpg");
		hq.setVendedor(v1);
		
		Moto cc = new Moto(2, "Moto2", 2, "flex", 45, 50000, 35000, 2022, "Honda", 800);
		cc.setImagem("assets/fiat-grand-siena-2021.jpg");
		cc.setVendedor(v1);
		
		Moto hh = new Moto(2, "Moto3", 2, "flex", 45, 50000, 35000, 2022, "Honda", 800);
		hh.setImagem("assets/fiat-grand-siena-2021.jpg");
		hh.setVendedor(v1);
		
		carros.add(c);
		carros.add(f);
		carros.add(s);
		motos.add(h);
		caminhoes.add(o);
		caminhoes.add(p);
		caminhoes.add(w);
		caminhoes.add(t);
		caminhoes.add(q);
		motos.add(hh);
		motos.add(cc);
		motos.add(hq);
		
		String teste = "Caminhao";
		
		for(int i = 0; i < motos.size(); i++) {
			if(motos.get(i).nome.equals(teste) == true) {
				System.out.println("moto encontrada");
			} else {
				System.out.println("erro");
			}
		}
		
		for(int i = 0; i < carros.size(); i++) {
			if(carros.get(i).nome.equals(teste) == true) {
				System.out.println("carro encontrado");
			} else {
				System.out.println("erro");
			}
		}
		
		for(int i = 0; i < caminhoes.size(); i++) {
			if(caminhoes.get(i).nome.equals(teste) == true) {
				System.out.println("caminhao encontrado");
			} else {
				System.out.println("erro");
			}
		}
		
		
		
		Catalogo cat = new Catalogo(1000);
		cat.addVeiculo(c);
		cat.addVeiculo(o);
		cat.addVeiculo(h);
		cat.addVeiculo(s);
		cat.addVeiculo(f);
		cat.addVeiculo(p);
		cat.addVeiculo(w);
		cat.addVeiculo(t);
		cat.addVeiculo(q);
		cat.addVeiculo(hh);
		cat.addVeiculo(cc);
		cat.addVeiculo(hq);
		
		return cat;
	}
//	public static void main(String[] args) {
//		
//		JanelaPrincipal window = new JanelaPrincipal();
		
		
		
		
//
//		Carro c = new Carro(4, 4, "flex", 321, 40000, 145000, 2015, "Fiat", false, 4, "sedan" );
////		System.out.println(c.getTipoCombsutivel());
//		
//		Caminhao o = new Caminhao(3,8, "diesel", 123, 100000, 500000, 2020, "Volvo", false, 2, 45000);
////		System.out.println(o.getCapacidadeDeCarga());
//		
//		Moto h = new Moto(2,2,"flex", 45, 50000, 35000, 2022, "Honda", false, 800);
////		System.out.println(h.getCilindrada());
//
//		Catalogo cat = new Catalogo(1000);
//		cat.addVeiculo(c);
//		cat.addVeiculo(o);
//		cat.addVeiculo(h);
//		
////		cat.print();
//		
//		
//		Comprador c1 = new Comprador("Comprador1", 78945612, 190, "Recanto");
//		
//		Venda b2 = new Venda(1, c1, o);
//		
//		System.out.println(b2);
//	}

}
