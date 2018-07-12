package Aves;

public class Canario extends Ave {
	
	
	public Integer tamano;

	
	
	public Canario(String sexo, Integer edad) {
		super(sexo, edad);
	}
	
	public Canario(String sexo, Integer edad, Integer tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}
	
	public void altura() {
		if (tamano != null) {
			if(this.tamano > 30) {
				System.out.println("Alto");
			}else if(this.tamano < 15) {
				System.out.println("Bajo");
			}else {
				System.out.println("Mediano");
			}
		}else {
			System.out.println("El Canario no tiene tamaño.");
		}
	}

}
	