/**
 * @author rachid
 *
 */
public class Car extends Vehicle {


	/**
	 * 
	 */
	
	
	public Car(String brand,int kilometers) {
		super(brand,kilometers);
		this.kilometers = kilometers ;
	}

	@Override
	public String doStuff() {
		return "Je suis " + this.getBrand() +" et je fais vroum vroum !" +" Tout en allant à une vitesse de " + this.getKilometers() + "km/h !" ;
	}

}
