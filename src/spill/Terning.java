package spill;

/**
 * @author Obl2_Gruppe42
 * Klasse for terning-objekt. 
 */
public class Terning {
	int terningId;
	int verdi;

	public Terning(int terningId, int verdi) {
		super();
		this.terningId = terningId;
		this.verdi = verdi;
	}

	public int getTerningId() {
		return terningId;
	}

	public void setTerningId(int terningId) {
		this.terningId = terningId;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
}


