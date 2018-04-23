package br.com.cocodonto.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.cocodonto.framework.daoHelper;
import br.com.cocodonto.model.entity.Paciente;


public class PacienteDao {
	
	public static void main(String[] args){
		//inserir();
	}
	
    
    public void inserir(Paciente pPaciente) {
    	
    	daoHelper objConexao = new daoHelper();    	
    	Connection conn = null;
    	Statement st = null;	
    	
		try 
		{   			
			conn = objConexao.getConnection();
			st =  conn.createStatement();			
			
			st.executeUpdate("INSERT INTO PACIENTE (ID, NOME, RG, CPF, SEXO) VALUES " +
							 "(' " + 3 + "','"
						      + pPaciente.getNAME()   + "','"
			                  + pPaciente.getRG()   + "','"
			                  + pPaciente.getCPF()  + "','"
			                  + pPaciente.getSEX()
			                  + "')");
	    	                 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			objConexao.releaseAll(conn, st);
		}		
    }
}
