package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection conectaDB() {
		
		Connection conexao = null; {
			
			try {
				
				String url = "jdbc:mysql://localhost/oliveiratrade?user=developer&password=12345678";
				conexao = DriverManager.getConnection(url);
			}
			
			catch (SQLException e) {
				e.getMessage();
			}
		}
		return conexao;
		
	}

}