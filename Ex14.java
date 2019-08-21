import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String[] chare = new String[10];
		String[] chare2 = new String[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Escreva alguma coisa: ");
			String palavra = entrada.nextLine();
			chare[i] = palavra;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Escreva alguma outra coisa: ");
			String palavra = entrada.nextLine();
			chare2[i] = palavra;
		}
		
		String[] intercalado = new String[20];
		int x = 0;
		for(int i = 0; i < 20; i++) {
			intercalado[i] = chare[x];
			i++;
			intercalado[i] = chare2[x];
			x++;
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.print(intercalado[i]);
		}
		
		entrada.close();

	}

}
