/**
 * 
 */
package br.com.cocodonto.model.entity;

/**
 * @author pedro.pinheiro
 *
 */
public class Dentista {

	private long ID;
	private String CRO;
	private String NAME;
	private String CPF;
	private String RG;
	
	private Endereco ADDRES;
	private Contato CONTACT;	
	
	public Dentista(long iD, String cRO, String nAME, String cPF, String rG) {
		this(cRO,nAME,cPF,rG);		
		ID = iD;		
	}
	
	public Dentista(String cRO, String nAME, String cPF, String rG) {
		super();
		CRO = cRO;
		NAME = nAME;
		CPF = cPF;
		RG = rG;
	}
	
	public Dentista(){
		super();
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getCRO() {
		return CRO;
	}

	public void setCRO(String cRO) {
		CRO = cRO;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public Endereco getADDRES() {
		return ADDRES;
	}

	public void setADDRES(Endereco aDDRES) {
		ADDRES = aDDRES;
	}

	public Contato getCONTACT() {
		return CONTACT;
	}

	public void setCONTACT(Contato cONTACT) {
		CONTACT = cONTACT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((CRO == null) ? 0 : CRO.hashCode());
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((NAME == null) ? 0 : NAME.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentista other = (Dentista) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (CRO == null) {
			if (other.CRO != null)
				return false;
		} else if (!CRO.equals(other.CRO))
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
		return true;
	}

	@Override
	public String toString() {
		return "Dentista [ID=" + ID + ", CRO=" + CRO + ", NAME=" + NAME + ", CPF=" + CPF + ", RG=" + RG + ", ADDRES="
				+ ADDRES + ", CONTACT=" + CONTACT + "]";
	}
	
	

	
}
