package ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) {
		try {
			Connection con = Conecta.criarConexao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
