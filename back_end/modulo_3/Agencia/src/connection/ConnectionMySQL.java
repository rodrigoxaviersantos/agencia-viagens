package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {

	private static String URL = "jdbc:mysql://localhost:3306/agencia_viagens";

	private static String USUARIO = "root";

	private static String SENHA = "123456";

	public static Connection createConnectionToMySQL() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);

		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		Connection connection = createConnectionToMySQL();
		
		if (connection != null) {
			System.out.println(connection + "\n\n **** Conexao obtida com sucesso! ****");
			connection.close();
		}
	}
	
}