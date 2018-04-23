package br.com.cocodonto.data;

import br.com.cocodonto.model.entity.Paciente;
import br.com.cocodonto.model.entity.SexoType;;


public class PacienteDaoTeste {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente("Zé Colmeia","123123","321321",SexoType.M);
		PacienteDao pacienteDao = new PacienteDao();
		
		pacienteDao.inserir(paciente);
	}

}
