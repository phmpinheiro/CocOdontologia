package br.com.cocodonto.model.entity;

public class Contato {
	private String EMAIL;
	private String PHONE;
	private String CELLPHONE;

	public Contato() {
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}

	public String getCELLPHONE() {
		return CELLPHONE;
	}

	public void setCELLPHONE(String cELLPHONE) {
		CELLPHONE = cELLPHONE;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [EMAIL=")
		       .append(EMAIL)
		       .append(", PHONE=")
		       .append(PHONE)
		       .append(", CELLPHONE=")
			   .append(CELLPHONE).append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CELLPHONE == null) ? 0 : CELLPHONE.hashCode());
		result = prime * result + ((EMAIL == null) ? 0 : EMAIL.hashCode());
		result = prime * result + ((PHONE == null) ? 0 : PHONE.hashCode());
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
		Contato other = (Contato) obj;
		if (CELLPHONE == null) {
			if (other.CELLPHONE != null)
				return false;
		} else if (!CELLPHONE.equals(other.CELLPHONE))
			return false;
		if (EMAIL == null) {
			if (other.EMAIL != null)
				return false;
		} else if (!EMAIL.equals(other.EMAIL))
			return false;
		if (PHONE == null) {
			if (other.PHONE != null)
				return false;
		} else if (!PHONE.equals(other.PHONE))
			return false;
		return true;
	}
	
	
	
	
	
	
}