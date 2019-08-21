import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade De informações: ");
		int n = entrada.nextInt();
		int valores[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Valor: ");
			valores[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print("\n"+valores[i]+":");
			for(int x = 0; x < valores[i]; x++) {
				System.out.print("#");
			}
		}
		entrada.close();
	}
}
