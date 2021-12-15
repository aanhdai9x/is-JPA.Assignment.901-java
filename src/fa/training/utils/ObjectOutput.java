package fa.training.utils;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import fa.training.entities.Customer;
import fa.training.entities.Order;

public class ObjectOutput {
	public static void writeData(Customer c, Order o) {
		try {
			FileOutputStream fos = new FileOutputStream("d:/customer.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Stock s[] = { 
					new Stock(1, c.getCustomer_id(), c.getName(), c.getPhoneNumber(), c.getAddress(), o.getNumber(), o.getDate()),
			};
			oos.writeObject(s);
			
			fos.close();
			oos.close();
			System.out.println("Write success");
		} catch (IOException ex) {
			System.out.println("Loi ghi file: " + ex);
		}
	}

}
