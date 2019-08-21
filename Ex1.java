import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] inteiros;
		inteiros= new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Escreva um Número Inteiro: ");
			inteiros[i] = entrada.nextInt();
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(inteiros[i]);
			
		}
		
		entrada.close();
	}

}
