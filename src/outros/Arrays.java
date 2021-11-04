package outros;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {

		// Array de strings
		String[] nomes = { "Arthur", "Fernando", "Camila", "Paula" };
		for (int contador = 0; contador < nomes.length; contador++) {
			System.out.println(nomes[contador]);
		}

		// Array de doubles
		double[] numerosDoubles = new double[10];
		for (int x = 0; x < numerosDoubles.length; x++) {
			numerosDoubles[x] = x + 1;
			System.out.println(numerosDoubles[x]);
		}

		// Array de inteiros aleatórios
		Random geraNumero = new Random();
		int[] inteirosAleatorios = new int[10];
		for (int i = 0; i < inteirosAleatorios.length; i++) {
			inteirosAleatorios[i] = geraNumero.nextInt(20);
			System.out.println(inteirosAleatorios[i]);
		}

		// Array Bidimensional tipo matriz
		int[][] matrizDeInteiros = { 
				{ 1, 2, 3, 5 }, 
				{ 4, 4, 7, 7 }, 
				{ 9, 1, 6 }, 
		};

		for (int linha = 0; linha < matrizDeInteiros.length; linha++) {
			for (int coluna = 0; coluna < matrizDeInteiros[linha].length; coluna++) {
				System.out.print(matrizDeInteiros[linha][coluna]);
			}
			System.out.println("");
		}
		
		System.out.println("Tamanho da linha 1: " + matrizDeInteiros[0].length);
		System.out.println("Tamanho da linha 2: " + matrizDeInteiros[1].length);
		System.out.println("Tamanho da linha 3: " + matrizDeInteiros[2].length);

	}

}
