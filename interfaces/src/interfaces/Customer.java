package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	
	//non parameter constructor
	public Customer() {
		
	}

	//parameter constructor
	public Customer(int id, String firstName, String lastName) {
		//super(); // parametresiz sııfı da 
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//getter-setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
