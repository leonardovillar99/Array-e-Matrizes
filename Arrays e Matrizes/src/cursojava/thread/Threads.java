package cursojava.thread;

import javax.swing.JOptionPane;

public class Threads {
	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo
		new Thread() {
			public void run() {
				//Dentro do run vai todo o c�digo da rotina e executa o que n�s queremos
				
				// C�digo da rotina para executar em processamento paralelo
				for(int pos = 0; pos <= 10; pos++) {
					
					// Sleep -> d� um tempo que voc� determina entre os parenteses para executar o c�digo
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Executando alguma rotina, por exemplo, envio de um e-mail: " + pos);
				}
			};
		}.start(); // Start inicia a Thread que fica processando paralelamente por baixo dos panos
		
		// Fim do c�digo em paralelo
		
		// C�digo do sistema do usu�rio continua o fluxo de trabalho
		System.out.println("Chegou ao fim do c�digo de teste de Thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}
}	
