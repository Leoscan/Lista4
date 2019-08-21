import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		float[] inteiros = new float[10];
		float[] medias = new float[10];
		
		for (int x = 1; x <= 10; x++) {
			float soma = 0;
			for (int i = 0; i < 4; i++) {
				System.out.print("Escreva as notas do aluno "+x+": ");
				inteiros[i] = entrada.nextFloat();
				soma = soma + inteiros[i];
			}
				medias[x-1] = soma/4;
		}
		int n = 0;
		for (int i = 0; i < 10; i++) {
			if (medias[i] >= 7) {
				n++;
			}
		}
		System.out.println(n+" Alunos conseguiram maior ou igual a 7 de média");
		entrada.close();

	}

}
