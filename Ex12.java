import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva as Palavras: ");
		String palavras = entrada.nextLine();
		
		String formatado[] = palavras.split(";");
		
		for(int i = 0; i < formatado.length; i++) {
			System.out.println(formatado[i]);
		}
		
		entrada.close();
	}

}
