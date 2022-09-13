package executavel.arrays;

public class Matriz {
	public static void main(String[] args) {
		
		// Isso é um array, após a adição de um novo valor dentro de novos colchetes o array se torna uma matriz
		int notas[][] = new int[2][3];
		
		notas[0][0] = 2;
		notas[0][1] = 8;
		notas[0][2] = 10;
		
		notas[1][0] = 3;
		notas[1][1] = 6;
		notas[1][2] = 7;
		
		for(int posLinha = 0; posLinha < notas.length; posLinha++) { // Percorre as linhas da matriz
			
			for(int posCol = 0; posCol < notas[posLinha].length; posCol++) { // Percorre as colunas da matriz
				System.out.println("Valor da matriz: " + notas[posLinha][posCol]);
			}
		}
	}
}