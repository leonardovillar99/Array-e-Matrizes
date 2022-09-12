package executavel.arrays;

public class Matriz {
	public static void main(String[] args) {
		
		// Isso é um array, após a adição de um novo valor dentro de novos colchetes o array se torna uma matriz
		int notas[][] = new int[4][4];
		
		notas[0][0] = 2;
		notas[0][1] = 8;
		notas[0][2] = 7;
		notas[0][3] = 10;
		
		notas[1][0] = 3;
		notas[1][1] = 6;
		notas[1][2] = 9;
		notas[1][3] = 7;
		
		notas[2][0] = 10;
		notas[2][1] = 8;
		notas[2][2] = 5;
		notas[2][3] = 9;
		
		System.out.println(notas);
	}
}