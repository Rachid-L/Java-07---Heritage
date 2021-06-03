/**
 * @author rachid
 *
 */
public class Boat extends Vehicle {

	

	/**
	 * 
	 */
	
	
	public Boat(String brand,int kilometers) {
		super(brand,kilometers);
		this.kilometers = kilometers ;
	}

	@Override
	public String doStuff() {
		return "Je suis " + this.getBrand() +" et je fais glou glou !" + " Tout en allant à une vitesse de " + this.getKilometers() + "km/h !";
	}

}
