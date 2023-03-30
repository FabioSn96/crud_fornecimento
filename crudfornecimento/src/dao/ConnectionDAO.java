package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionDAO {
	
	public Connection connectDB() {
		
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/db_fornecimento?useTimezone=true&serverTimezone=UTC&user=root&password=root123";
			conn = DriverManager.getConnection(url);
		} catch (SQLException error) {
			JOptionPane.showMessageDialog(null, error.getMessage());
		}
		return conn;
	}
}
