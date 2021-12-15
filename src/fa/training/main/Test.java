package fa.training.main;



import java.sql.Date;
import java.util.Scanner;

import fa.training.common.Common;
import fa.training.entities.Customer;
import fa.training.entities.Order;
import fa.training.services.CustomerDAO;
import fa.training.services.impl.CustomerDAOImpl;
import fa.training.services.impl.OrderDAOImpl;
import fa.training.utils.ObjectOutput;
import fa.training.utils.Validator;


public class Test {
	
	static CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
	static CustomerDAO customerDAO = new CustomerDAO();
	static OrderDAOImpl orderDAOImpl = new OrderDAOImpl();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//1.
		//Validator.validateCustomer();
		
		//2.
		//System.out.println("Ghi file customer.dat");
		//ObjectOutput.writeData(new Customer("1", "Duong", "123456789", "Cau Giay"), new Order("1", "1234567890", Date.valueOf("2021-12-12")));
		
		//3.
		//customerDAOImpl.findAll();
		
		//5.
		//System.out.println("Nhập phone number: "); String phoneNumber1 = scan.next();
		//orderDAOImpl.search(phoneNumber1);
		
		//6.
		//System.out.println("Nhập phone number: "); String phoneNumber2 = scan.next();
		//customerDAOImpl.delete(phoneNumber2);
		
	}

	
}
