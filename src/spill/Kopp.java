package spill;

import java.util.ArrayList;
import java.util.Random;


/**
 * @author Obl2_Gruppe42
 * Her blir terningen trillet og kopp-objektet opprettet.
 */
public class Kopp {
	int koppId;
	int sum;
	ArrayList<Terning> terninger = new ArrayList<Terning>();
	

	public Kopp(int koppId, int sum) {
		super();
		this.koppId = koppId;
		this.sum = sum;
	}
	
	

	public int getKoppId() {
		return koppId;
	}



	public void setKoppId(int koppId) {
		this.koppId = koppId;
	}



	/**
	 * @return legger sammen terninger som er trillet og returnerer summen.
	 */
	public int getSum() {
		sum = 0;
		for(int i = 0; i<terninger.size(); i++) {
			sum += terninger.get(i).getVerdi();
		}
		return sum;
	}



	public void setSum(int sum) {
		this.sum = sum;
	}



	/**
	 * Terninga blir trillet ved å hente et random tall fra (0-5) 1-6. 
	 */
	public void Trill() {
		Random rnd = new Random();
		for(int i = 0; i<2; i++ ) {
			int rand = rnd.nextInt(6)+1;
			Terning terning = new Terning(i,rand);
			terninger.add(terning);
		}
		
	}



	public ArrayList<Terning> getTerninger() {
		return terninger;
	}



	public void setTerninger(ArrayList<Terning> terninger) {
		this.terninger = terninger;
	}




	
}
