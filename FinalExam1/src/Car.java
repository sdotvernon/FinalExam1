
public class Car extends Vehicle {

	public Car(String VehicleName, String Color, double CarWeight, Person Owner, int NumberofDoors) {
		super(VehicleName, Color, CarWeight, Owner);
		// TODO Auto-generated constructor stub
	}
	public int getNumberofDoors() {
		return NumberofDoors;
	}
	public void setNumberofDoors(int numberofDoors) {
		NumberofDoors = numberofDoors;
	}
	private int NumberofDoors;
}
