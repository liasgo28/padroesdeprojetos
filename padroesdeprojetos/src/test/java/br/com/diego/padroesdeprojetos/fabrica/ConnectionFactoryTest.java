package br.com.diego.padroesdeprojetos.fabrica;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {

	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().getConnection();		
                
	}

}
