import java.util.UUID;


public class Person implements VehicleInterface{

	private String FirstName;
	private String LastName;
	private UUID PersonID;
	//private UUID PersonID;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public UUID getPersonID() {
		return PersonID;
	}
	public void setPersonID(UUID personID) {
		PersonID = personID;
	}
	public Person(String FirstName, String LastName, UUID PersonID){
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.setPersonID(PersonID);
	
	}
	public String toString(){
		return "Person " + getFirstName() + " " + getLastName() + " " + getPersonID();
		
	}
	
	}

