package cursojava.thread;

import java.awt.Dimension;
import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() {
		setTitle("Contador com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null); //Centraliza a tela no centro
		setResizable(false); //Não permite a mudança de tamanho da tela manualmente
		
		setVisible(true);
	}
}
