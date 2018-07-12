package Principal;

import Aves.Piolin;
import Aves.Loro;
import Aves.Ave;

public class Principal {

	public static void main(String[] args) {
		
		Piolin p = new Piolin("M", 10 , 20 , 5);
		
		Loro l = new Loro("F", 15, "N", "Azul");
		Loro l2 = new Loro("F", 15, "N", "Azul");
		
		System.out.println(Ave.numeroAves);
		
		p.quienSoy();
		l.quienSoy();
		
		p.altura();
		l.deDondeEres();
		
		p.tamano = 50;
		p.altura();	
		
		l.region="E";
		l.deDondeEres();
			
	}
}
