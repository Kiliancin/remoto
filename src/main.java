import java.util.Scanner;

public class main {

	public static Scanner sc = new Scanner (System.in);
	public static Scanner sn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		
	}

	
	public static void menu() {
		int opc = 0;
		
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1. Sumar dos numeros");
			System.out.println("2. Multiplicar dos numeros");
			System.out.println("3. Salir");
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				sumar();
				break;

			case 2:
				multiplicar();
				break;
				
			case 3:
				System.out.println("Adios!");
				break;
				
			default:
				System.out.println("Elige una opcion correcta!");
				break;
			}
			
		} while (opc != 3);
	}
	
	public static void sumar() {
		int cantidad = 0;
		int result = 0;
		
		System.out.println("Con cuantos numeros vas a operar? ");
		cantidad = sn.nextInt();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Dime el numero " + (i+1) + " para sumar: ");
			int num = sn.nextInt();
			
			result += num;
		}
		
		
		System.out.println("La suma de los numeros es: " + result);
	}
	
	public static void multiplicar() {
		int cantidad = 0;
		int result = 0;
		
		System.out.println("Con cuantos numeros vas a operar? ");
		cantidad = sn.nextInt();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Dime el numero " + (i+1) + " para multiplicar: ");
			int num = sn.nextInt();
			
			result *= num;
		}
		
		
		System.out.println("La multiplicacion de los numeros es: " + result);
	}
	
}
