package RepasoJava;

import java.util.Scanner;


public class IntroducirDatos {
		
	public static void mainSepararFecha13(String[] args) {
		int dia, mes, ano, total, suerte;
		int cifra1, cifra2, cifra3, cifra4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el dia de tu cumpleaños: ");
		dia = sc.nextInt();
		System.out.println("Introduce nunmero el mes de tu cumpleaños: ");
		mes = sc.nextInt();
		System.out.println("Introduce el año de tu cumpleaños: ");
		ano = sc.nextInt();
		
		total = dia + mes + ano;
		
		cifra1 = total /1000;
		cifra2 = total /100%10;
		cifra3 = total /10%10;
		cifra4 = total %10;
		
		suerte = cifra1 + cifra2 + cifra3 + cifra4;
		System.out.println("Tu numero de la suerte es " + suerte);
		
		}
	
    public static void mainSeparador12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N de cinco cifras: ");
        N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras
        System.out.println(N%10);
        System.out.printf("%02d %n",N%100);
        System.out.printf("%03d %n",N%1000);
        System.out.printf("%04d %n",N%10000);
        System.out.printf("%05d %n",N);
    }
	
	public static void mainSeparador11(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de 5 cifras");
		numero = sc.nextInt();
		
		System.out.println(numero / 10000);
		System.out.println(numero / 1000);
		System.out.println(numero / 100);
		System.out.println(numero / 10);
		System.out.println(numero);
	}
	
	
	public static void mainSeparador10(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor a separar: ");
		numero = sc.nextInt();
		
		System.out.println("El valor del primer digito es " + numero/100);
		System.out.println("El valor del segundo digito es " + (numero/10)%10);
		System.out.println("El valor del tercer digito es " + numero%10);
		
	}
	
	public static void mainAreaTriangulo9(String[] args){
		/* 
		 * Programa que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c)
		 * según la siguiente fórmula: area=raiz2(p(p-a)(p-b)(p-c)) donde p = (a+b+c)/2 
		 */
		
		int a,b,c,p,area; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la medida del lado A ");
		a = sc.nextInt();
		System.out.println("Introduce la medida del lado B ");
		b = sc.nextInt();
		System.out.println("Introduce la medida del lado C ");
		c = sc.nextInt();
		
		p = (a+b+c)/2;
		
		area = p * (p-a)*(p-b)*(p-c);
		System.out.println("El area del triangulo es: " + area);
		
	}
	
	public static void mainRadioEsfera8(String[] args){
		
		double longitud , volumen;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de la esfera: ");
		longitud = sc.nextDouble();
		//Hay que poner el .0 para que pille el double
		//Si no devuelve mal el numero
		volumen = (4.0/3* Math.PI * Math.pow(longitud, 3));
		System.out.println("El volumen de la esfera es " + volumen);
		
	}
	
	public static void mainPitagoras7(String[] args){
		
		int cateto1, cateto2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del primer cateto: ");
		cateto1 = sc.nextInt();
		System.out.println("Introduce la longitud del segundo cateto: ");
		cateto2 = sc.nextInt();
		
		System.out.println("La longitud de la hipotenusa es: " + Math.sqrt(Math.pow(cateto1, 2)+(Math.pow(cateto2, 2))));
	}
	
	public static void mainVelocidad6(String[] args){
		
		double velocidad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la velocidad a cambiar");
		velocidad = sc.nextDouble();
		
		System.out.println(velocidad + " Km/h -> " + velocidad*1000/3600 + " m/s");
	}
	
	
	public static void mainArea5(String[] args){
		
		double radio, longitud, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia: ");
		radio = sc.nextDouble();
		
		longitud = (2* Math.PI * radio);
		area= (Math.PI * Math.pow(radio, 2));
		
		System.out.println("La longitud de la circunferencia es " + longitud + " y el area es " + area);
		
		
	}
	
	public static void mainGrados4(String[] args){
		
		double gradoC;
		double gradoF;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de grados centigraods a convertir: ");
		gradoC = sc.nextDouble();
		gradoF = (32 + (9 * gradoC / 5));
		
		System.out.println("La conversion de " + gradoC + " grados centigrados en grados Fahrenheit es de " + gradoF);
		
	}
	
	public static void mainNumeros3(String[] args){
		int numero;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Introduce un numero para muiltiplicar: ");
		numero = n.nextInt();
		
		System.out.println("El doble del numero " + numero+ " es " + numero*2);
		System.out.println("El triple del numero " + numero +" es " + numero*3);
	}
	
	
	public static void mainString2(String[] args){
		String nombre;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre favorito: ");
		nombre = n.nextLine();
		
		System.out.println("Tu nombre favorito es " + nombre);
	}
	
	
	public static void mainNumerosEnteros1(String[] args){
	int n1;
	int n2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce un valor para el primer numero");
	n1 = sc.nextInt();
	System.out.println("Introduce un valor para el siguiente numero");
	n2 = sc.nextInt();
	
	
	System.out.println(n1);
	System.out.println(n2);
	
	}
}
