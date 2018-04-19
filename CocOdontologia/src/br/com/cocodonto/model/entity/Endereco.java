package br.com.cocodonto.model.entity;

public class Endereco {
	
	private String ADDRES;
	private String CITY;
	private String NEIGHBORHOOD;
	private String CEP;

	public Endereco() {
	}

	public String getADDRES() {
		return ADDRES;
	}

	public void setADDRES(String pADDRES) {
		ADDRES = pADDRES;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String pCITY) {
		CITY = pCITY;
	}

	public String getNEIGHBORHOOD() {
		return NEIGHBORHOOD;
	}

	public void setNEIGHBORHOOD(String pNEIGHBORHOOD) {
		NEIGHBORHOOD = pNEIGHBORHOOD;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String pCEP) {
		CEP = pCEP;
	}
}