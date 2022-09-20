package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout())/* Painel de Componentes */;
	private JLabel hora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel hora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("Parar");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	public TelaTimeThread() {
		setTitle("Contador com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null); //Centraliza a tela no centro
		setResizable(false); //Não permite a mudança de tamanho da tela manualmente
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		hora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(hora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(true);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		hora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(hora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(true);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for(int qtd = 0; qtd < 30; qtd++) {
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText() + " - " + (qtd + 1));
				
				fila.add(filaThread);
				}
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}
		});
		
		fila.start();	
		add(jPanel, BorderLayout.WEST);
		
		// SetVisible sempre será o último comando
		setVisible(true);
	}
}
