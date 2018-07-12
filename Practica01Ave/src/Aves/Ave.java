package Aves;

public class Ave {

	public String sexo;
	public Integer edad;
	public static Integer numeroAves = 0;
	
	public Ave(String sexo, Integer edad /*,Integer numeroAves*/) {
		this.sexo = sexo;
		this.edad = edad;
		numeroAves++;
	}
	

	/*public Integer getNumeroAves() {
		return numeroAves;
	}

	public void setNumeroAves(Integer numeroAves) {
		this.numeroAves = numeroAves;
	}
	
	*/
	
	public void quienSoy() {
		System.out.println("El Sexo es " + sexo + " y una edad de " + edad + ".");
	}
	
	public static void mostrarAvesCreadas() {
		System.out.println(numeroAves);
	}
	
}
