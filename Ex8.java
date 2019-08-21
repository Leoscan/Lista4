import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int[] num = new int[5];
			int soma = 0;
			int mult = 1;
			
			for (int i = 0; i < 5; i++) {
				System.out.print("Escreva um número: ");
				num[i] = entrada.nextInt();
			}
			System.out.print("Números: ");
			for (int i = 0; i < 5; i++) {
				System.out.print(num[i]+", ");
			}
			for (int i = 0; i < 5; i++) {
				soma = soma + num[i];
			}
			System.out.println("\nSoma: "+soma);
			for (int i = 0; i < 5; i++) {
				mult = mult * num[i];
			}
			System.out.println("Multiplicação: "+mult);
				
			entrada.close();
		}

	}