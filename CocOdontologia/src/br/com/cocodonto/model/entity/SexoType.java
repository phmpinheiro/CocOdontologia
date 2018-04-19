/**
 * 
 */
package br.com.cocodonto.model.entity;

/**
 * @author pedro.pinheiro
 *
 */
public enum SexoType {
	
	M ("Masculino"), F ("FEMININO");
	
	private String description;
	
	private SexoType(String pDescricao){
		this.description = pDescricao;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
