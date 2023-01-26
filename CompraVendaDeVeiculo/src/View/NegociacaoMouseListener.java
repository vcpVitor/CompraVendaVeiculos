package View;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Plataforma.Comprador;
import Plataforma.Veiculo;
import Plataforma.Venda;

public class NegociacaoMouseListener implements MouseListener {
	
	private Veiculo veiculo;
	public NegociacaoMouseListener(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void mouseClicked(MouseEvent e) {
		JanelaPrincipal.clear();
		Venda vend = new Venda(431, new Comprador("Gabriel", 432, 321, "72312"), veiculo);
		JanelaPrincipal.showRecibo(vend);
		
		
		


	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
