package br.com.cocodonto.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.cocodonto.framework.DaoHelper;
import br.com.cocodonto.model.entity.Paciente;


public class PacienteDao {
	
	public static void main(String[] args){
		//inserir();
	}	
    
    public void inserir(Paciente pPaciente) {
    	
    	DaoHelper objConexao = new DaoHelper();    	
    	Connection conn = null;
    	PreparedStatement st = null;	
    	
		try 
		{   			
			conn = objConexao.getConnection();
			int index = 0;
			st =  conn.prepareStatement("INSERT INTO PACIENTE (ID, NOME, RG, CPF, SEXO) VALUES (?,?,?,?,?)");
			st.setInt(++ index, (int) pPaciente.getID());
			st.setString(++ index, pPaciente.getNAME());
			st.setString(++ index, pPaciente.getRG());
			st.setString(++ index, pPaciente.getCPF());
			st.setString(++ index, pPaciente.getSEX().toString());
			st.executeUpdate();
	    	                 
		} catch (SQLException e) {
			throw new CreateDaoException("Não foi possível realizar le INSERT", e);
		} finally {			
			objConexao.releaseAll(conn, st);
		}		
    }
}
