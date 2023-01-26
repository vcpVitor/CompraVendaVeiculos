package View;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import Plataforma.Veiculo;
import View.JanelaPrincipal;

public class VeiculoCatalogoMouseListener implements MouseListener {

	private Veiculo v;
	
	public VeiculoCatalogoMouseListener(Veiculo veiculo) {
		v = veiculo;
	}
	
	public void mouseClicked(MouseEvent e) {
		//System.out.println("clicked " + v.getNome());
		JanelaPrincipal.clear();
		JanelaPrincipal.showDetails(v);
	}

	public void mousePressed(MouseEvent e) {
		return;

	}

	public void mouseReleased(MouseEvent e) {
		return;

	}

	public void mouseEntered(MouseEvent e) {
		return;

	}

	public void mouseExited(MouseEvent e) {
		return;

	}

}
