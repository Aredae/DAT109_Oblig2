package spill;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Obl2_Gruppe42
 * Lager en arrayliste for spillere.
 */
public class Terningspill {
	private int id;
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	Kopp kopp = new Kopp(1,0);

	public Terningspill(int id, int antallspillere) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param navn på spiller fra konsollen.
	 */
	public void leggTiSpiller(String navn) {
		Spiller spiller = new Spiller(navn);
		spillere.add(spiller);
	}
	
	/**
	 * Kaller på spillmetoden fra Spillere for hver spiller.
	 * Den printer ut hva hver spiller fikk og finner ut hvem som er vinneren. 
	 */
	public void spill() { 
		
		String vinner = "";
		int sum = 0;
		for(int j = 0; j<spillere.size(); j++) {
			spillere.get(j).spill(kopp);
			kopp.getTerninger().clear();
		}
		for(int i = 0; i<spillere.size(); i++) {
			System.out.println();
			System.out.println(spillere.get(i).getNavn() + " fikk " + spillere.get(i).getVerdi());
			if(spillere.get(i).getVerdi()>sum) {
				sum = spillere.get(i).getVerdi();
				vinner = spillere.get(i).getNavn();
			}
			
		}
		System.out.println("\n" + vinner + " vant med " + sum + " poeng!");
		
	}

}
