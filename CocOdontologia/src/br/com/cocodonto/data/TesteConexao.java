package br.com.cocodonto.data;

import java.sql.*;

public class TesteConexao {
	
	public static void main(String[] args) throws Exception{
		
		//Load no drive
		Class.forName("oracle.jdbc.OracleDriver");
		
		//Pega a conexão
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.35:1521:XE","aluno","123");
		
		//Cria o statment
		Statement st = conn.createStatement();
		
		//executa a query
		ResultSet rs = st.executeQuery("select * from taluno");
		
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		
	}

}
