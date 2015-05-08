
public class TestVehicle {
	
	public static void main(String args[]){
		Person MyPerson = new Person("Kurt", "Russel", 1872923);
		Car MyCar = new Car("Honda", "Blue", 3000, MyPerson, 4);
		Truck MyTruck = new Truck("Ford","Red", 8000, MyPerson, 2);
		Person MyPerson2 = new Person("Bruce", "Lee", 786430950);
		
		//System.out.println(MyPerson);
		
		
		Motorcycle MyMotorcycle = new Motorcycle("Harley", "Black", 700, MyPerson, false);
	}
}
