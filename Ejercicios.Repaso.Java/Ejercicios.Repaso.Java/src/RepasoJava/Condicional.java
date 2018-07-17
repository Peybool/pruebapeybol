package RepasoJava;

import java.io.IOException;
import java.util.Scanner;

public class Condicional {

	public static void main (String[] args) {
		
	}
	
	public static void mainCaracterMinusculo5/*NO FUNCIONA*/(String[] args) throws IOException {
		
		char car1, car2;
		
		System.out.println("Introduce el primer caracter");
		car1 = (char)System.in.read();
		System.in.read();
		System.out.println("Introduce el segundo caracter");
		car2 = (char)System.in.read();
		System.in.read();
		
		 if(Character.isLowerCase(car1)){ //utilizamos el método isLowerCase de la clase Character
	           if(Character.isLowerCase(car2))
	               System.out.println("Los dos son letras minúsculas");
	           else
	               System.out.println("El primero es una letra minúscula pero el segundo no");
	        }
	        else{
	            if(Character.isLowerCase(car2))
	               System.out.println("El segundo es una letra minúscula pero el primero no");
	           else
	               System.out.println("Ninguno es una letra minúscula");
	        }
	}
	
	public static void mainCaracter4/*NO FUNCIONA*/(String[] args) throws IOException {
		
		char car1, car2;
        System.out.print("Introduzca primer carácter: ");
        car1 = (char)System.in.read(); //lee un carácter
        System.in.read();  //saltar el intro que ha quedado en el buffer
        System.out.print("Introduzca segundo carácter: ");
        car2 = (char)System.in.read(); //lee el segundo carácter
        System.in.read();
        
        if(car1 == car2)
           System.out.println("Son iguales");    
        else
           System.out.println("No son iguales");
	}
	
	public static void mainMayusMinus3(String[] args) throws IOException {
		
		char letra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un caracter: ");
		letra = (char)System.in.read(); //lee un solo caracter
		
		if(Character.isUpperCase(letra)) {
			System.out.println("ES MAYUSCULA");
		}else {
			System.out.println("es minuscula");
		}
		
		
	}
	
	
	public static void mainMultiplosDiez2(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero para saber si es multiplo de 10");
		numero = sc.nextInt();
		
		if(numero%10 == 0) {
			System.out.println("Es multiplo de 10");
		}else {
			System.out.println("no es multiplo de 10");
		}
		
	}

	public static void mainParImpar1(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero par o impar: ");
		numero = sc.nextInt();
		
		if(numero % 2 ==0) {
			System.out.println("Es Par");
		}else {
			System.out.println("Es impar");
		}
					

	}

}
