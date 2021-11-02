import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro carroUm = new Carro();
		
		System.out.println("Nome do carro: " + carroUm.nome);
		System.out.println("Modelo: " + carroUm.modelo);
		System.out.println("Ano: " + carroUm.ano);
		
		carroUm.acelerar();
		carroUm.acelerar();
		carroUm.acelerar();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a kilometragem: ");
		int km = entrada.nextInt();
		
		System.out.println(carroUm.calculaConsumo(km));
		
		for(int x = 0; x < carroUm.acessorios.length; x++) {
			System.out.println(carroUm.acessorios[x]);
		}
		
		carroUm.nome = "Ferrari";
		System.out.println(carroUm.nome);
	}

}
