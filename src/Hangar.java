/**
 * 
 */

/**
 * @author rachid
 *
 */
public class Hangar {

	public static void main(String[] args) {
		
		Car citroen = new Car("Citroen",0);
		
		citroen.setBrand("Citroen Ds4");
		citroen.setKilometers(250);
		
		Car dodoche = new Car("2CV",0);
		
		dodoche.setBrand("2CV");
		dodoche.setKilometers(90);

		Boat bateau1 = new Boat("KiVaVite",0);
		
		bateau1.setBrand("VaVite");
		bateau1.setKilometers(350);
		
		Boat bateau2 = new Boat("KiVaPasVite",0);
		
		bateau2.setBrand("VaPaVite");
		bateau2.setKilometers(10);
		
		
		System.out.println(citroen.doStuff());
		System.out.println(dodoche.doStuff());
		System.out.println(bateau1.doStuff());
		System.out.println(bateau2.doStuff());
		
	}

}
