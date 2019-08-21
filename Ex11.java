import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] data = new int[3];
		
		int dd = 0;
		System.out.print("Informe o dia: ");
		dd = entrada.nextInt();
		data[0] = dd;
		
		int mm = 0;
		System.out.print("Informe o mês: ");
		mm = entrada.nextInt();
		data[1] = mm;
		
		int aa = 0;
		System.out.print("Informe o ano: ");
		aa = entrada.nextInt();
		data[2] = aa;
		
		int div = 0;
		div = aa % 4;
		
		boolean bisx = false;
		
		if (div == 0) bisx = true;
		
		if (mm > 12) System.out.println("Data Invalida");
		
		if (dd <= 31 && mm == 1){
			System.out.println("Data Válida");
		} else if (dd >= 31 && mm == 1) System.out.println("Data Invalida");
		
		if (dd == 29 && mm == 2 && bisx == true){
			System.out.println("Data Válida");
		} else if (dd <= 28 && mm == 2){
			System.out.println("Data Válida");
		} else if (dd >= 28 && mm == 2) System.out.println("Data Invalida");
		
		if (dd <= 31 && mm == 3){
			System.out.println("Data Válida");
		} else if (dd >= 31 && mm == 3) System.out.println("Data Invalida");
		
		if (dd <= 30 && mm == 4){
			System.out.println("Data Válida");
		} else if (dd >= 30 && mm == 4) System.out.println("Data Invalida");
		
		if (dd <= 31 && mm == 5){
			System.out.println("Data Válida");
		} else if (dd >= 31 && mm == 5) System.out.println("Data Invalida");
		
		if (dd <= 30 && mm == 6){
			System.out.println("Data Válida");
		} else if (dd >= 30 && mm == 6) System.out.println("Data Invalida");
		
		if (dd <= 31 && mm == 7){
			System.out.println("Data Válida");
		} else if (dd >= 31 && mm == 7) System.out.println("Data Invalida");
		
		if (dd <= 30 && mm == 8){
			System.out.println("Data Válida");
		} else if (dd >= 30 && mm == 8) System.out.println("Data Invalida");
		
		if (dd <= 30 && mm == 9){
			System.out.println("Data Válida");
		} else if (dd >= 30 && mm == 9) System.out.println("Data Invalida");
		
		if (dd <= 31 && mm == 10){
			System.out.println("Data Válida");
		} else if (dd >= 31 && mm == 10) System.out.println("Data Invalida");
		
		if (dd <= 30 && mm == 11){
			System.out.println("Data Válida");
		} else if (dd >= 31 && mm == 11) System.out.println("Data Invalida");
		
		if (dd <= 31 && mm == 12){
			System.out.println("Data Válida");
		} else if (dd >= 31 && mm == 12) System.out.println("Data Invalida");
		
		
		entrada.close();
		
		for(int i = 0; i < 3; i++) {
			System.out.print(data[i]+"/");
		}

	}

}
