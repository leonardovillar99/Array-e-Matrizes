package executavel.arrays;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		
		System.out.println("========== Percorrendo um array com For ==========");
		
		// O método split pega nossa variável texto e quebra ela em indices jogando dentro de um array
		String text = "Leonardo,Curso Java,8,7,9,2";
		
		String[] valoresArray = text.split(",");
		
		for(int pos = 0; pos < valoresArray.length; pos++) {
			System.out.println("Valor na posição " + (pos + 1) + " é: " + valoresArray[pos]);
		}
		
		// Convertendo um array em uma lista	
		System.out.println("\n========== Convertendo array para uma lista e percorrendo com ForEach ==========");
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		//Convertendo uma lista para array
		System.out.println("\n========== Convertendo lista para um array e percorrendo com For ==========");

		String[] conversaoArray = list.toArray(new String[6]);
		
		for(int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println("Valor na posição " + (pos + 1) + " é: " + conversaoArray[pos]);
		}
		
		
	}
}
