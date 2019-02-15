package spill;

/**
 * @author Obl2_Gruppe42
 * Klasse for spiller-objekt.  
 */
public class Spiller {

	String navn;
	int verdi;

	public Spiller(String navn) {
		super();
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
	
	/**
	 * @param Kaller på trill fra kopp-klassen og setter sum for hver spiller av de 2 terningene som ble trillet.
	 */
	public void spill(Kopp kopp) { 
		kopp.Trill();
		verdi = kopp.getSum();
	}
}
