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
			System.out.println("1. Sumar numeros");
			System.out.println("2. Multiplicar numeros");
			System.out.println("3. Restar dos numeros: ");
			System.out.println("4. Dividir dos numeros: ");
			System.out.println("5. Salir");
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				sumar();
				break;

			case 2:
				multiplicar();
				break;
				
			case 3:
				restar2();
				break;
				
			case 4:
				dividir2();
				break;
				
			case 5:
				System.out.println("Adios!");
				break;
				
			default:
				System.out.println("Elige una opcion correcta!");
				break;
			}
			
		} while (opc != 5);
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
	
	public static void restar2() {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Dime el primer numero: ");
		num1 = sn.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		num2 = sn.nextInt();
		
		System.out.println("La resta de los dos numeros es: " + (num1-num2));
	}
	
	public static void dividir2() {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Dime el primer numero: ");
		num1 = sn.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		num2 = sn.nextInt();
		
		System.out.println("La division de los dos numeros es: " + (num1/num2));
	}
}
