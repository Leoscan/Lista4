import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] c = new String[10];
		String[] consoantes = new String[10];
		
		int consoante = 0;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Escreva um caracter: ");
			String p = entrada.nextLine();
			
			c[i] = p.substring(0, 1);
			
			if (!(c[i].equals("a")) && !(c[i].equals("e")) && !(c[i].equals("i")) && !(c[i].equals("o")) && !(c[i].equals("u"))) {
				consoantes[consoante] = c[i];
				consoante = consoante + 1;
			}	
		}
		
		System.out.println("Total de consoantes: "+consoante);
		
		for (int i = 0; i < consoante; i++) {
			System.out.println("Consoante: "+consoantes[i]);
		}
		
		entrada.close();
	}

}
