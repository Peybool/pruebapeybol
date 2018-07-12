package Aves;

public class Loro extends Ave{
	
	public String region;
	public String color;
	

	public Loro(String sexo, Integer edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}


	//Metodo IF
	public void deDondeEres() {
		if ("N".equalsIgnoreCase(region)) {
			System.out.println("Norte");
		}if("S".equalsIgnoreCase(region)) {
			System.out.println("Sur");
		}if("E".equalsIgnoreCase(region)) {
			System.out.println("Este");
		}if("O".equalsIgnoreCase(region)) {
			System.out.println("Oeste");
		}

	}
	
	/*
	 public void deDondeEres() {
		if ("N".equalsIgnoreCase(region)) {
			System.out.println("Norte");
		}else if("S".equalsIgnoreCase(region)) {
			System.out.println("Sur");
		}else if("E".equalsIgnoreCase(region)) {
			System.out.println("Este");
		}else {
			System.out.println("Oeste");
		}

	}
	 * */
	
	
	//Metodo Switch
	public void deDondeEresSW() {
		switch(this.region) {
		case "N":
			System.out.println("Norte");
			break;
		case "S":
			System.out.println("Sur");
			break;
		case "E":
			System.out.println("Este");
			break;
		case "O":
			System.out.println("Oeste");
			break;	
		default: 
			System.out.println("Es una region vacia");
		}

	}

}
