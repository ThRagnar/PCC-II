package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public Connection getMysqlConnection() throws Exception{
		String  stringDeConexao = "jdbc:mysql://localhost/escola";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager .getConnection(stringDeConexao,"root", ""); 
		return null;
	}
}
