package View;
import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.*;

import Plataforma.Veiculo;

public class ContainerCatalogo {
	private ImageIcon image;
	private Box box;
	
	public ContainerCatalogo(Veiculo v) {
		this.image = new ImageIcon(new ImageIcon(v.getImagem()).getImage().getScaledInstance(200, 140, Image.SCALE_DEFAULT));
		box = Box.createVerticalBox();
		
		box.addMouseListener(new VeiculoCatalogoMouseListener(v));
		
		box.add(new JLabel(image, SwingConstants.CENTER));
		box.add(new JLabel(v.getNome(), SwingConstants.CENTER));
		box.add(new JLabel(String.valueOf(v.getAno()), SwingConstants.CENTER));
		
//        box.setBounds(50, 120, 200, 250);
	}
	
	public Box getBox() {
		return box;
	}
}
