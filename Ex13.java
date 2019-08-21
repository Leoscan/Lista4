import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade[] = new int[5];
		float altura[] = new float[5];
		
		for(int i = 0; i < 5; i++) {
		System.out.print("Escreva a idade: ");
		idade[i] = entrada.nextInt();
		
		System.out.print("Escreva a altura: ");
		altura[i] = entrada.nextFloat();
		}
		
		int velhoi = 0;
		float velhoa = 0;
		int novoi = 0;
		float novoa = 0;
		
		float altoi = 0;
		float altoa = 0;
		float baixoi = 0;
		float baixoa = 0;
		
		float somaa = 0;
		float somab = 0;
		
		for (int i = 0; i < 5; i++) {
			if(i == 0) {
				somaa = somaa + altura[i];
				somab = somab + idade[i];
				velhoi = idade[i];
				velhoa = altura[i];
				novoa =  altura[i];
				novoi =  idade[i];
				
				baixoa =  altura[i];
				baixoi =  idade[i];
				altoa =  altura[i];
				altoi =  idade[i];
			} else {
				somaa = somaa + altura[i];
				somab = somab + idade[i];				
				if(idade[i] > velhoi ) {
					velhoi = idade[i];
					velhoa = altura[i];
				}
				
				if (idade[i] < novoi) {
					novoa =  altura[i];
					novoi =  idade[i];
				}
				if(altura[i] > altoa ) {
					altoa =  altura[i];
					altoi =  idade[i];
				}
				
				if (altura[i] < baixoa) {
					baixoa =  altura[i];
					baixoi =  idade[i];				}
				
			}
		}

		
		float mediaa = somaa/5;
		float mediab = somab/5;
		
		System.out.println("Média altura: "+mediaa);
		System.out.println("Média idade: "+mediab);
		System.out.println("Mais velho: "+velhoi+" anos, "+velhoa+"cm");
		System.out.println("Mais novo: "+novoi+" anos, "+novoa+"cm");
		System.out.println("Mais alto: "+altoi+" anos, "+altoa+"cm");
		System.out.println("Mais baixo: "+baixoi+" anos, "+baixoa+"cm");
		for(int i = 4; i >= 0; i--) {
			System.out.println("idade: "+idade[i]);
			System.out.println("altura: "+altura[i]);
		}
		
		entrada.close();
	}

}
