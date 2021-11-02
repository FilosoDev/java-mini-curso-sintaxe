package outros;
import java.lang.Math;

public class OperadoresAritméticos {

	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 2;
		
		// Soma
		int total = numA + numB;
		System.out.println(total);
		
		// Subtração
		total = numA - numB;
		System.out.println(total);
		
		// Multiplicação
		total = numA * numB;
		System.out.println(total);
		
		// Divisão
		total = numA / numB;
		System.out.println(total);
		double numC, numD, totalDouble;
		numC = 5;
		numD = 2;
		totalDouble = numC / numD;
		System.out.println(totalDouble);
		
		// Resto da divisão (MOD)
		total = numA % numB;
		System.out.println(total);
		
		// Potenciação
		double numE, numF, potencia;
		numE = 6;
		numF = 3;
		potencia = Math.pow(numE, numF);
		System.out.println(potencia);
		
		// Radiciação (Raiz quadrada)
		double raiz;
		raiz = Math.sqrt(100);
		System.out.println(raiz);
		
		// Raiz cúbica
		raiz = Math.cbrt(27);
		System.out.println(raiz);

	}

}
