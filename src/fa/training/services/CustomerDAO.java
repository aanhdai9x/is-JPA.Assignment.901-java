package fa.training.services;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Customer;
import fa.training.entities.Order;
import fa.training.utils.DataConfig;

public class CustomerDAO {

	public List<String> createCustomer(Customer customer, Order order) {
		String INSERT_CUSTOMER = "insert into Customer VALUES (?, ?, ?, ?)";
		String INSERT_ORDER = "insert into [Order] VALUES (?, ?, ?)";
		List<String> ls = new ArrayList<String>();
		try {
			Connection connection = DataConfig.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
			preparedStatement.setString(1, customer.getCustomer_id());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getPhoneNumber());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.executeUpdate();

			PreparedStatement preparedStatement2 = connection.prepareStatement(INSERT_ORDER);
			preparedStatement2.setString(1, customer.getCustomer_id());
			preparedStatement2.setString(2, order.getNumber());
			preparedStatement2.setDate(3, (java.sql.Date) order.getDate());
			preparedStatement2.executeUpdate();

			ls.add(customer.getCustomer_id());
			ls.add(customer.getName());
			ls.add(customer.getPhoneNumber());
			ls.add(customer.getAddress());
			ls.add(order.getNumber());
			ls.add(order.getDate().toString());
			System.out.println("Insert success");
			System.out.println(ls);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ls;
	}

}
