package outros;
import java.util.Scanner;

public class ComandosDeEntrada {

	public static void main(String[] args) {
		
		int vInteiro;
		double vDouble;
		String vString;
		String vFrase;
		float vFloat;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe uma frase: ");
		vFrase = entrada.nextLine();
		System.out.print("A frase �: " + vFrase);
		
		System.out.printf("Informe uma palavra: ");
		vString = entrada.next();
		System.out.print("A palavra �: " + vString);
		
		System.out.printf("Informe um inteiro: ");
		vInteiro = entrada.nextInt();
		System.out.print("O inteiro �: " + vInteiro);
		
		System.out.printf("Informe um double: ");
		vDouble = entrada.nextDouble();
		System.out.print("O double �: " + vDouble);
		
		System.out.printf("Informe um float: ");
		vFloat = entrada.nextFloat();
		System.out.print("O float �: " + vFloat);
		
		
	}
}
