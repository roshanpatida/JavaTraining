package javaconnectivity.jsp;


public class StudentData {

	private String firstName;
	private String lastName;
	private boolean goldCustomer;
	
	public StudentData(String firstName, String lastName, boolean goldCustomer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.goldCustomer = goldCustomer;
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

	public boolean isGoldCustomer() {
		return goldCustomer;
	}

	public void setGoldCustomer(boolean goldCustomer) {
		this.goldCustomer = goldCustomer;
	}
	
	
	
}