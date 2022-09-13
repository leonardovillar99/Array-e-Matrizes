package executavel.arrays;

public class SplitArray {
	public static void main(String[] args) {
		
		// O método split pega nossa variável texto e quebra ela em indices jogando dentro de um array
		String text = "Leonardo,Curso Java,8,7,9,2";
		
		String[] valoresArray = text.split(",");
		
		for(int pos = 0; pos < valoresArray.length; pos++) {
			System.out.println("Valor na posição " + (pos + 1) + " é: " + valoresArray[pos]);
		}
	}
}
