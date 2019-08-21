import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		float[] inteiros = new float[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Escreva as notas: ");
			inteiros[i] = entrada.nextFloat();
		}
		
		float soma = 0;
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Nota "+i+": "+inteiros[i-1]);
			soma = soma + inteiros[i-1];
		}
			System.out.println("Média: "+(soma/4));
		
		entrada.close();
	}

}
