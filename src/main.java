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
				sumar2();
				break;

			case 2:
				multiplicar2();
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
	
	public static void sumar2() {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Dime el primer numero: ");
		num1 = sn.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		num2 = sn.nextInt();
		
		System.out.println("La suma de los dos numeros es: " + (num1+num2));
	}
	
	public static void multiplicar2() {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Dime el primer numero: ");
		num1 = sn.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		num2 = sn.nextInt();
		
		System.out.println("La multiplicacion de los dos numeros es: " + (num1*num2));
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
