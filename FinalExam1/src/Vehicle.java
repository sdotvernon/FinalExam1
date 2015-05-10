
public class Vehicle implements VehicleInterface{
	private String VehicleName;
	private String Color;
	private double CarWeight;
	private Person Owner;
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public double getCarWeight() {
		return CarWeight;
	}
	public void setCarWeight(double carWeight) {
		CarWeight = carWeight;
	}
	public Person getOwner() {
		return Owner;
	}
	public void setOwner(Person owner) {
		Owner = owner;
	}
	public Vehicle(String VehicleName, String Color, double CarWeight, Person Owner)
		{
	this.Owner = Owner;
	}
	
}
	