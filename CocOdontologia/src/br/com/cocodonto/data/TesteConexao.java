package br.com.cocodonto.data;

import java.sql.*;

public class TesteConexao {
		
	
	public static void main(String[] args) throws Exception{
		
		final String urlSenior = "jdbc:oracle:thin:@localhost:1521:XE";
		
		//Load no drive
		Class.forName("oracle.jdbc.OracleDriver");
		
		//Pega a conexão		
		Connection conn = DriverManager.getConnection(urlSenior,"cocodontologia","123");
		
		//Cria o statment
		Statement st = conn.createStatement();
		
		//executa a query
		ResultSet rs = st.executeQuery("select * from taluno");
		
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		
	}

}
