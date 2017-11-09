/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificamappa;

import java.io.FileNotFoundException;

/**
 *
 * @author marco.pistollato
 */
public class VerificaMappa {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Mappa map=new Mappa();
		map.load("stops.txt");
		map.search(45.2, 12.6);
		map.stampaFermata();
	}
	
}
