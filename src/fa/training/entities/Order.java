package fa.training.entities;

import java.util.Date;

public class Order extends Customer {
	private String customer_id;
	private String number;
	private Date date;
	
	Order(){
		
	}

	
	public Order(String customer_id, String number, Date date) {
		super();
		this.customer_id = customer_id;
		this.number = number;
		this.date = date;
	}


	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
