package RepasoJava;

import java.io.IOException;
import java.util.Scanner;

public class Condicional {
	
	public static void mainMesCorrecto10(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int mes;
	        System.out.print("Introduzca número de mes: ");
	        mes =  sc.nextInt();
	        if(mes < 1 || mes > 12) //se comprueba que el valor del mes es correcto
	            System.out.println("Mes incorrecto");
	        else{  //si el mes es correcto
	            switch(mes){  //se muestra el nombre mediante una instrucción switch
	                case 1: System.out.print("Enero");
	                        break;
	                case 2: System.out.print("Febrero");
	                        break;
	                case 3: System.out.print("Marzo");
	                        break;
	                case 4: System.out.print("Abril");
	                        break;
	                case 5: System.out.print("Mayo");
	                        break;
	                case 6: System.out.print("Junio");
	                        break;
	                case 7: System.out.print("Julio");
	                        break;
	                case 8: System.out.print("Agosto");
	                        break;
	                case 9: System.out.print("Septiembre");
	                        break;
	                case 10: System.out.print("Octubre");
	                        break;
	                case 11: System.out.print("Noviembre");
	                        break;
	                case 12: System.out.print("Diciembre");
	                        break;
	            }
	            // mostrar si es un mes de 30, 31 0 28 días
	            if(mes == 4 || mes == 6 || mes == 9 || mes == 11)       
	               System.out.println(" es un mes de 30 días");
	            else if(mes == 2)
	                     System.out.println(" es un mes de 28 días");
	                   else
	                      System.out.println(" es un mes de 31 días");
	        }
	}
	
	public static void mainFormatoFecha9(String[] args) {
		
		int H, M, S;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la hora: ");
		H = sc.nextInt();
		System.out.println("Introduzca los minutos: ");
		M = sc.nextInt();
		System.out.println("Introduzca los segundo: ");
		S = sc.nextInt();
		
		if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) {
			System.out.println("Fecha en formato correcto");
		}else {
			System.out.println("El formato de la fecha no es el correcto");
		}
			
		
	}
	
	public static void mainNumeroMayor8(String[] args) {
		
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer dato: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo dato: ");
		num2 = sc.nextInt();
		System.out.println("Introduce el tercer dato: ");
		num3 = sc.nextInt();
		
		if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
	}
	
	public static void mainExcepcionDivisionCero7/*Regulintxi*/(String[] args) {
		
		int num1, num2, division;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero para dividir: ");
		num1 = sc.nextInt();
		System.out.println("introduce un numero para dividir al primero:");
		num2 = sc.nextInt();
		
		division = num1 / num2;
		
		try {
			if (num2 == 0) {
				System.out.println("El divisor no puede ser igual a 0");
			}else {
				System.out.println("El resultado de la division es " + division);
			}
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * Scanner sc = new Scanner(System.in);
        double dividendo, divisor;
        System.out.print("Introduzca el dividendo: ");
        dividendo = sc.nextDouble(); 
        System.out.print("Introduzca el divisor: ");
        divisor = sc.nextDouble(); 
        if(divisor==0)
           System.out.println("No se puede dividir por cero");    
        else{
            System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);   
            System.out.printf("%.2f / %.2f = %.2f %n" , dividendo, divisor , dividendo/divisor);
        }*/

	public static void mainCaracterNumero6(String[] args) throws IOException {
		
		char car;
		
		System.out.println("Introduce un caracter: ");
		car = (char)System.in.read();
		
		if(Character.isDigit(car)) {
			System.out.println("El caracter es un numero");
		}else {
			System.out.println("El caracter NO es un numero");
		}
			
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
