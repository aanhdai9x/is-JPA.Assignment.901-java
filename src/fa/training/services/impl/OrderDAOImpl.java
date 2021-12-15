package fa.training.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Order;
import fa.training.services.BaseDAO;
import fa.training.utils.DataConfig;

public class OrderDAOImpl implements BaseDAO<Order, String> {

	@Override
	public void save(Order obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String str) {
		List<Order> lo = new ArrayList<Order>();
		String SELECT_ORDER_BY_PHONE_NUMBER = "select * from [Order] o, Customer c where o.customer_id = c.customer_id and phoneNumber = '123456789'";
		try {
			Connection conn = DataConfig.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ORDER_BY_PHONE_NUMBER);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				lo.add(new Order(rs.getString("customer_id"), rs.getString("number"), rs.getDate("date")));
				System.out.println(rs.getString("customer_id") +"\t"+ rs.getString("number") +"\t"+ rs.getDate("date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
