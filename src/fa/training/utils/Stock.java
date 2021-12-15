package fa.training.utils;

import java.io.Serializable;
import java.util.Date;

public class Stock implements Serializable {
	private int ids;
	private String customer_id;
	private String name;
	private String phonneNumber;
	private String address;
	private String number;
	private Date date;

	public Stock(int ids, String customer_id, String name, String phonneNumber, String address, String number,
			Date date) {
		super();
		this.ids = ids;
		this.customer_id = customer_id;
		this.name = name;
		this.phonneNumber = phonneNumber;
		this.address = address;
		this.number = number;
		this.date = date;
	}

	@Override
	public String toString() {
		return ids + "-" + customer_id + "-" + name + "-" + phonneNumber + "-" + address + "-" + number + "-" + date;
	}

}
