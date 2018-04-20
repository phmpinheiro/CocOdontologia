package br.com.cocodonto.data;

import java.sql.*;

public class objConexao {
		
	final String urlSenior = "jdbc:oracle:thin:@localhost:1521:XE";
	
	public Connection iniciarConexaoOracle() throws ClassNotFoundException, SQLException{
	  //Load no drive
      Class.forName("oracle.jdbc.OracleDriver");
      
      //Pegar a conexão		
      Connection conn = DriverManager.getConnection(urlSenior,"cocodontologia","123");
      
      return conn;
	}
	
	public static void main(String[] args) throws Exception{
		
		//Cria o statment
		//Statement st = conn.createStatement();
		
		//executa a query
		//ResultSet rs = st.executeQuery("select * from taluno");
		
		//while (rs.next()) {
		//	System.out.println(rs.getString(1));
		//}
		
	}

}
