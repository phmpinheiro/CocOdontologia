/**
 * 
 */
package br.com.cocodonto.model.entity;

/**
 * @author pedro.pinheiro
 *
 */
public class Paciente {

	private long ID;
	private String NAME;
	private String RG;
	private String CPF;
	private Contato CONTACT;		
	private Endereco ADDRES;
	private SexoType SEX;	
	//
	public Paciente(long iD, String nAME, String rG, String cPF, Contato cONTACT, Endereco aDDRES, SexoType sEX) {
		super();
		ID = iD;
		NAME = nAME;
		RG = rG;
		CPF = cPF;
		CONTACT = cONTACT;
		ADDRES = aDDRES;
		SEX = sEX;
	}
	public Paciente(long iD, String nAME, String rG, String cPF, SexoType sEX) {
		super();
		ID = iD;
		NAME = nAME;
		RG = rG;
		CPF = cPF;
		SEX = sEX;
	}
	public Paciente(String nAME, String rG, String cPF, SexoType sEX) {
		super();
		NAME = nAME;
		RG = rG;
		CPF = cPF;
		SEX = sEX;
	}
	/**
	 * @return the iD
	 */
	public long getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(long iD) {
		ID = iD;
	}
	/**
	 * @return the nAME
	 */
	public String getNAME() {
		return NAME;
	}
	/**
	 * @param nAME the nAME to set
	 */
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	/**
	 * @return the rG
	 */
	public String getRG() {
		return RG;
	}
	/**
	 * @param rG the rG to set
	 */
	public void setRG(String rG) {
		RG = rG;
	}
	/**
	 * @return the cPF
	 */
	public String getCPF() {
		return CPF;
	}
	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	/**
	 * @return the cONTACT
	 */
	public Contato getCONTACT() {
		return CONTACT;
	}
	/**
	 * @param cONTACT the cONTACT to set
	 */
	public void setCONTACT(Contato cONTACT) {
		CONTACT = cONTACT;
	}
	/**
	 * @return the aDDRES
	 */
	public Endereco getADDRES() {
		return ADDRES;
	}
	/**
	 * @param aDDRES the aDDRES to set
	 */
	public void setADDRES(Endereco aDDRES) {
		ADDRES = aDDRES;
	}
	/**
	 * @return the sEX
	 */
	public SexoType getSEX() {
		return SEX;
	}
	/**
	 * @param sEX the sEX to set
	 */
	public void setSEX(SexoType sEX) {
		SEX = sEX;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((NAME == null) ? 0 : NAME.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		result = prime * result + ((SEX == null) ? 0 : SEX.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (ID != other.ID)
			return false;
		if (NAME == null) {
			if (other.NAME != null)
				return false;
		} else if (!NAME.equals(other.NAME))
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		if (SEX != other.SEX)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [ID=").append(ID).append(", NAME=").append(NAME).append(", RG=").append(RG)
				.append(", CPF=").append(CPF).append(", CONTACT=").append(CONTACT).append(", ADDRES=").append(ADDRES)
				.append(", SEX=").append(SEX).append("]");
		return builder.toString();
	}
	
	
	
}
