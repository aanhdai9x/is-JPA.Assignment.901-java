package fa.training.utils;

import java.sql.Date;
import java.util.Scanner;

import fa.training.entities.Customer;
import fa.training.entities.Order;
import fa.training.services.CustomerDAO;

public class Validator {
	static CustomerDAO customerDAO = new CustomerDAO();
	
	public static void validateCustomer() {
		Scanner scan = new Scanner(System.in);
		String phoneNumber1="", number1="", customer_id1, name1, address1, sdate1;
		do {
			System.out.println("Create Customer");
			System.out.println("Nhập customer_id: "); customer_id1 = scan.next();
			System.out.println("Nhập tên: "); name1 = scan.next();
			System.out.println("Nhập Phone Number: "); phoneNumber1 = scan.next();
			System.out.println("Nhập Address: "); address1 = scan.next();
			System.out.println("Nhập number: "); number1 = scan.next();
			System.out.println("Nhập Date định dạng yyyy-MM-dd: "); sdate1 = scan.next(); 
			System.out.println("--------------------------------------------------------");
			
		} while(!validPhoneNumber(phoneNumber1) && !validNumber(number1));
		customerDAO.createCustomer(new Customer(customer_id1, name1, phoneNumber1, address1), new Order(customer_id1, number1, Date.valueOf(sdate1)));
		
	}
	
	public static boolean validNumber(String number) {
		if(number.length() == 10) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean validPhoneNumber(String phoneNumber) {
		if(phoneNumber.isEmpty() 
				|| phoneNumber.length() > 11 
				|| phoneNumber.length() < 10) {
			return false;
		} else {
			return true;
		}
	}
}
