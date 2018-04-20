package br.com.cocodonto.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.cocodonto.model.entity.Paciente;


public class PacienteDao {
	
	public static void main(String[] args){
		inserir();
	}
	
    
    public static void inserir() {
    	
    	System.out.println("teste");
    	
		try {
			objConexao objConexao = new objConexao();
	    	Connection conn = objConexao.iniciarConexaoOracle();
	    	Statement st = conn.createStatement();
	    	st.executeUpdate("INSERT INTO PACIENTE (ID, NOME, RG, CPF, EMAIL, TELEFONE, CELULAR) VALUES (1,'PEDRO','4103066','00476568919','PEDRO.PINHEIRO@SENIOR.COM.BR','996413088','996413088') ");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
    }
}
