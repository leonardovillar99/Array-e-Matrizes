package cursojava.thread;

import javax.swing.JOptionPane;

public class Threads {
	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo
		new Thread() {
			public void run() {
				//Dentro do run vai todo o código da rotina e executa o que nós queremos
				
				// Código da rotina para executar em processamento paralelo
				for(int pos = 0; pos <= 10; pos++) {
					
					// Sleep -> dá um tempo que você determina entre os parenteses para executar o código
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Executando alguma rotina, por exemplo, envio de um e-mail: " + pos);
				}
			};
		}.start(); // Start inicia a Thread que fica processando paralelamente por baixo dos panos
		
		// Fim do código em paralelo
		
		// Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("Chegou ao fim do código de teste de Thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
}	
