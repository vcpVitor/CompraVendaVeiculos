package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import java.awt.GridLayout;


import Plataforma.Carro;
import Plataforma.Catalogo;
import Plataforma.Veiculo;
import Plataforma.Venda;

public class JanelaPrincipal implements ActionListener{
	public static JFrame mainframe;
	public static JPanel panelCatalogo;
	private static JButton cadastro = new JButton("Cadastrar");
	
	
	public JanelaPrincipal() {
		
		
		cadastro.addActionListener(this);
		
		mainframe = new JFrame("Catálogo");
		mainframe.setSize(1280, 720);
		mainframe.add(cadastro);
		cadastro.setLocation(0, 0);
		cadastro.setSize(120,40);
		
		panelCatalogo = new JPanel();
		panelCatalogo.setBounds(0, 0, 1280, 720);
		panelCatalogo.setLayout(new GridLayout(3,3));
		
		
		JScrollPane painelScroll = new JScrollPane(panelCatalogo);
		
		mainframe.add(painelScroll);
	}
	
	public static void clear() {
		panelCatalogo.removeAll();
		panelCatalogo.revalidate();
		mainframe.repaint();
	}
	
	public static void showDetails(Veiculo v) {
		ImageIcon image = new ImageIcon(new ImageIcon(v.getImagem()).getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT));
		
		Box box = Box.createHorizontalBox();
		Box inBox = Box.createVerticalBox();
		
		inBox.add(new JLabel("   Marca: " + v.getMarca()));
		inBox.add(new JLabel("   Nome: " + v.getNome()));
		inBox.add(new JLabel("   Ano: " + String.valueOf(v.getAno())));
		inBox.add(new JLabel("   Preco: " + String.valueOf(v.getPreco())));
		
		
		
		JLabel painel = new JLabel();
		painel.setLayout(new BorderLayout());
		JButton botao = new JButton("Comprar");
		JLabel poup = new JLabel("   Telefone: " + String.valueOf(v.getVendedor().getTelefone()));
		inBox.add(poup);
		poup.setLayout(new BorderLayout());
		painel.add(botao, BorderLayout.SOUTH);
		inBox.add(botao);
		botao.addMouseListener(new NegociacaoMouseListener(v));
		
		
		box.add(new JLabel(image, SwingConstants.LEFT));
		box.add(inBox);

		panelCatalogo.add(box);
		mainframe.repaint();
		
		
//		if (v instanceof Carro) {
//			System.out.println("Carro");
//		} else {
//			System.out.println("Not Carro");
//		}
	}
	
	public void addContainerCatalogo(Catalogo cat) {
		Veiculo[] veiculos = cat.getListaVeiculos();
		panelCatalogo.removeAll();
		for (int i = 0; i < cat.length(); i++) {
			panelCatalogo.add(new ContainerCatalogo(veiculos[i]).getBox());
			}
	}
	
	
	public void setVisible() {
		mainframe.setVisible(true);
	}
	public static void showRecibo(Venda recibo) {
		JPanel poup = new JPanel();
		JLabel vend = new JLabel("   Vendedor: " + recibo.getVeiculo().getVendedor().getNome());
		JLabel comp = new JLabel("   Comprador: " + recibo.getComprador().getNome());
		JLabel vei = new JLabel("   Veiculo: " + recibo.getVeiculo().getNome());
		poup.add(vend);
		poup.add(comp);
		poup.add(vei);
		
		
		
		panelCatalogo.add(poup);
		mainframe.repaint();
		
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

        if(src.equals(cadastro)) {
        	
        	JTextField Marcafield = new JTextField();
        	JTextField Precofield = new JTextField();
        	JPanel panel = new JPanel(new GridLayout(0,1));
            panel.add(new JLabel("Insira Marca:"));
            panel.add(Marcafield);
            panel.add(new JLabel("Insira Preco:"));
            panel.add(Precofield);

            int result = JOptionPane.showConfirmDialog(null, panel, "Adicionar Veiculo",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
           if (result == JOptionPane.OK_OPTION) {
        	 Veiculo veiculo = new Carro();
        	 veiculo.setMarca(Marcafield.getText());
        	 veiculo.setPreco(Integer.parseInt(Precofield.getText()));
        	 
        	 ContainerCatalogo c = new ContainerCatalogo(veiculo);
        	 panelCatalogo.add(c.getBox());               
           }
        	
           panelCatalogo.revalidate();
           panelCatalogo.repaint();
        }
		
	}
	
}


	
