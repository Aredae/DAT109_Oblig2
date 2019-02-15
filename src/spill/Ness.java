package spill;

import java.util.Scanner;



/**
 * @author Obl2_Gruppe42
 *
 */
public class Ness {

	/**
	 * @param Main for kjøring med inntasting av navn og antall spillere.
	 */
	public static void main(String[] args) { 
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Skriv inn antall spillere:");
		int antallspillere = Integer.parseInt(reader.nextLine());
		Terningspill terningspill = new Terningspill(1,antallspillere);
		for(int i = 0; i<antallspillere; i++) {
			System.out.println("Skriv inn navn:");
			String spillernavn = reader.nextLine();	
			terningspill.leggTiSpiller(spillernavn);
		}
		terningspill.spill();
		
	}
	
}
