
public class Variaveis {
	public static void main(String[] args) {
		
		// Comentário de uma linha.
		
		/*
		 * Comentário de mais de uma linha.
		 * 
		 * */
		
		// Comando que imprimme valor na tela.
		// System.out.print("Valor: " + varInt);
		//System.out.println("Ola mundo!!!!!");
		
		// Variáveis inteiras
		
		int varInt = 11; // 4 bytes
		System.out.println(varInt);
		System.out.println("Menor valor: " + Integer.MIN_VALUE);
		System.out.println("Maior valor: " + Integer.MAX_VALUE);
		
		long varLong1 = 500000000; // 8 bytes
		long varLong2 = 922555555555L;
		System.out.println(varLong1);
		System.out.println(varLong2);
		System.out.println("Menor valor: " + Long.MIN_VALUE);
		System.out.println("Maior valor: " + Long.MAX_VALUE);
		
		
		short varShort; //2 bytes
		varShort = 32767;
		System.out.println(varShort);	
		System.out.println("Menor valor: " + Short.MIN_VALUE);
		System.out.println("Maior valor: " + Short.MAX_VALUE);
		
		byte varByte = 127; // 1 byte
		System.out.println(varByte);
		System.out.println("Menor valor: " + Byte.MIN_VALUE);
		System.out.println("Maior valor: " + Byte.MAX_VALUE);
		
		
		// Variáveis reais (ponto flutuante)
		
		float varFloat = 3.14159265f; // 4 bytes
		System.out.println(varFloat);
		System.out.println("Menor valor: " + Float.MIN_VALUE);
		System.out.println("Maior valor: " + Float.MAX_VALUE);
				
		
		double varDouble = 3.141592653589793; // 8 bytes
		System.out.println(varDouble);
		System.out.println("Menor valor: " + Double.MIN_VALUE);
		System.out.println("Maior valor: " + Double.MAX_VALUE);
		
		
		// Outras variáveis
		
		// Boolean
		boolean varBooleano = true; // 1 bit
		System.out.println(varBooleano);
		
		// Char
		char simbolo = 'a';
		System.out.println(simbolo);
		simbolo = 123;
		System.out.println(simbolo);
		
		// String
		String palavra = "Uma palavra ou uma frase...";
		palavra = palavra + " ok";
		System.out.println(palavra);

				
	}
}
