package br.com.cocodonto.framework;

import java.sql.*;

public class daoHelper {
		
	final String urlSenior = "jdbc:oracle:thin:@localhost:1521:XE";
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		
		//Load no drive
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//Pegar a conexão		
			conn = DriverManager.getConnection(urlSenior,"cocodontologia","123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void release(Statement pSt) {		
		if (pSt == null)  return;
				
		try {
			pSt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void release(Connection pConn){
		if (pConn == null) return;
		
		if (pConn != null){
			  try {
				pConn.close();
			  } catch (SQLException e) {
				e.printStackTrace();
			  }
		 }
	}
	
	public void release(ResultSet pRset){
		if (pRset == null) return;
		
		if (pRset != null){
			  try {
				  pRset.close();
			  } catch (SQLException e) {
				e.printStackTrace();
			  }
		 }
	}
	
	public void releaseAll(Connection pConn,Statement pSt){
		this.release(pSt);
		this.release(pConn);
	}
	
	public void releaseAll(Connection pConn,Statement pSt, ResultSet pRset){
		this.release(pSt);
		this.releaseAll(pConn, pSt);
	}	
}
