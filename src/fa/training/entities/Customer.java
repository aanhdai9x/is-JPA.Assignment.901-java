package fa.training.entities;

public class Customer {
	private String customer_id;
	private String name;
	private String phoneNumber;
	private String address;
	
	Customer(){
		
	}

	public Customer(String customer_id, String name, String phoneNumber, String address) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
