import java.util.Scanner;
	public class Ex2 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			float[] reais;
			reais= new float[10];
			
			for (int i = 0; i < 10; i++) {
				System.out.print("Escreva um Número Real: ");
				reais[i] = entrada.nextFloat();
				
			}
			
			for (int i = 9; 0 <= i; i--) {
				System.out.println(reais[i]);
				
			}
			
			entrada.close();
		}

	}
