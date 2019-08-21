import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] num = new int[20];
		int[] par = new int[20];
		int[] imp = new int[20];
		
		int contp = 0;
		int conti = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Escreva um número: ");
			num[i] = entrada.nextInt();
			
			if ((num[i] % 2) == 0) {
				par[contp] = num[i];
				contp++;
			} else {
				imp[conti] = num[i];
				conti++;
			}
		}
		System.out.print("Números: ");
		for (int i = 0; i < 20; i++) {
			System.out.print(num[i]+", ");
		}
		System.out.print("\nPar: ");
		for (int i = 0; i < contp; i++) {
			System.out.print(par[i]+", ");
		
		}
		System.out.print("\nÍmpar: ");
		for (int i = 0; i < conti; i++) {
			System.out.print(imp[i]+", ");
		}
		
		entrada.close();
	}

}
