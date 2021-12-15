package fa.training.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fa.training.entities.Customer;
import fa.training.entities.Order;
import fa.training.services.BaseDAO;
import fa.training.utils.DataConfig;

public class CustomerDAOImpl implements BaseDAO<Customer, String>{

	@Override
	public void save(Customer obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String str) {
		boolean rowDeleted;
		try {
			String DELETE_CUSSTOMER_BY_PHONE_NUMBER = "delete [Order] FROM [Order] o, Customer c where c.customer_id = o.customer_id and phoneNumber = ? ";
			Connection connection = DataConfig.getConnection();
			PreparedStatement statement = connection.prepareStatement(DELETE_CUSSTOMER_BY_PHONE_NUMBER);
			statement.setString(1, str);
			rowDeleted = statement.executeUpdate() > 0;
			System.out.println("Deleted Order where phone number = " + str);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void findAll() {
		System.out.println("Find all Customers: ");
		String SELECT_CUSTOMER = "select * from Customer";
		List<Customer> lc = new ArrayList<Customer>();
		Customer customer = null;
		try {
			Connection conn = DataConfig.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_CUSTOMER);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				
				String customer_id = rs.getString("customer_id");
				String name = rs.getString("name");
				String phoneNumber = rs.getString("phoneNumber");
				String address = rs.getString("address");
				
				customer = new Customer(customer_id, name, phoneNumber, address);
				System.out.println(
						customer_id + "  "+ " " +name + " " + phoneNumber + "  " + address );
				lc.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void search(String str) {
		
	}

}
