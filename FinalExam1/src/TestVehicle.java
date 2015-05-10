import java.util.UUID;


public class TestVehicle {
	
	public static void main(String args[]){
		Person MyPerson = new Person("Kurt", "Russel", UUID.randomUUID());
		Car MyCar = new Car("Honda", "Blue", 3000, MyPerson, 4);
		Truck MyTruck = new Truck("Ford","Red", 8000, MyPerson, 2);
		Person MyPerson2 = new Person("Bruce", "Lee", UUID.randomUUID());
		
		System.out.println(MyPerson);
		System.out.println(MyPerson2);
		
		Motorcycle MyMotorcycle = new Motorcycle("Harley", "Black", 700, MyPerson, false);
	}
}
