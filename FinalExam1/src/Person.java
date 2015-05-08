import java.util.UUID;


public class Person {

	private String FirstName;
	private String LastName;
	private int PersonID;
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
	public int getPersonID() {
		return PersonID;
	}
	public void setPersonID(int personID) {
		PersonID = personID;
	}
	public Person(String FirstName, String LastName, int PersonID){
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		//this.setPersonID(PersonID);
		this.setPersonID(PersonID);
	}
	public String toString(){
		return "Person " + getFirstName() + " " + getLastName();
		
	}
	
	}

