
public class Truck extends Vehicle {

	public Truck(String VehicleName, String Color, double CarWeight,
			Person Owner, int Axels) {
		super(VehicleName, Color, CarWeight, Owner);
		// TODO Auto-generated constructor stub
	}
		public int getNumberofAxels() {
		return NumberofAxels;
	}
	public void setNumberofAxels(int numberofAxels) {
		NumberofAxels = numberofAxels;
	}
		private int NumberofAxels;
}
