package outros;
import java.lang.Math;

public class OperadoresAritm�ticos {

	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 2;
		
		// Soma
		int total = numA + numB;
		System.out.println(total);
		
		// Subtra��o
		total = numA - numB;
		System.out.println(total);
		
		// Multiplica��o
		total = numA * numB;
		System.out.println(total);
		
		// Divis�o
		total = numA / numB;
		System.out.println(total);
		double numC, numD, totalDouble;
		numC = 5;
		numD = 2;
		totalDouble = numC / numD;
		System.out.println(totalDouble);
		
		// Resto da divis�o (MOD)
		total = numA % numB;
		System.out.println(total);
		
		// Potencia��o
		double numE, numF, potencia;
		numE = 6;
		numF = 3;
		potencia = Math.pow(numE, numF);
		System.out.println(potencia);
		
		// Radicia��o (Raiz quadrada)
		double raiz;
		raiz = Math.sqrt(100);
		System.out.println(raiz);
		
		// Raiz c�bica
		raiz = Math.cbrt(27);
		System.out.println(raiz);

	}

}
