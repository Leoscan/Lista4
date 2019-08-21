import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos Números: ");
		int n = entrada.nextInt();
		
		int[] inteiros = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Escreva um número (inteiro): ");
			inteiros[i] = entrada.nextInt();
		}
		
		int soma = 0;
		int maior = 0;
		int menor = 0;
		int par = 0;
		int impar = 0;
		float media = 0;
		
		for (int i = 0; i < n; i++) {
			if(i == 0) {
				soma = soma + inteiros[i];
				maior = inteiros[i];
				menor =  inteiros[i];
				
				if ((inteiros[i] % 2) == 0) {
					par = par + 1;
				} else impar = impar + 1;
			} else {
				soma = soma + inteiros[i];
				
				if(inteiros[i] > maior) {
					maior = inteiros[i];
				}
				
				if (inteiros[i] < menor) {
					menor =  inteiros[i];
				}
				
				if ((inteiros[i] % 2) == 0) {
					par = par + 1;
				} else impar = impar + 1;
			}
		}
		
		System.out.println("Soma: "+soma);
		System.out.println("Maior Número: "+maior);
		System.out.println("Menor Número: "+menor);
		System.out.println("Pares: "+par);
		System.out.println("Impares: "+impar);
		
		media = soma/n;
		int acima = 0;
		int abaixo = 0;
		
		for (int i = 0; i < n; i++) {
			if (inteiros[i] > media) {
				acima = acima + 1;
			} else if (inteiros[i] < media) {
				abaixo = abaixo + 1;
			}
		}
		
		System.out.println("Números acima da média: "+impar);
		System.out.println("Números abaixo da média: "+impar);
		
				
		entrada.close();
	}

}
