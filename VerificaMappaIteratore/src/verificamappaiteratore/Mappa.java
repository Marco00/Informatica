/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificamappaiteratore;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author marco.pistollato
 */
public class Mappa {
	private ListaConcatenata<PuntoMappa> l;
	private int pos;
	private final int id=0;
	private final int name=2;
	private final int lat=4;
	private final int lon=5;
	public Mappa(){
		l=new ListaConcatenata<>();
	}
	public void load(String fileName) throws FileNotFoundException{
		File inputFile=new File(fileName);
		Scanner input=new Scanner(inputFile);
		input.nextLine();
		while(input.hasNextLine()){
			String a=input.nextLine();
			String[] campi=a.split(",");
			try{
			int campo1=Integer.parseInt(campi[id]);
			String campo2=campi[name];
			double campo3=Double.parseDouble(campi[lat]);
			double campo4=Double.parseDouble(campi[lon]);
			PuntoMappa p=new PuntoMappa(campo1, campo2, campo3, campo4);
			l.aggiungiFermata(p);
			}catch(NumberFormatException e){
				System.out.println("Non trovato");
			}
		}
	}
	public PuntoMappa search(double latitudine, double longitudine){
		double distanza=Double.MAX_VALUE;
		PuntoMappa finale=null;       
		for(Iteratore<PuntoMappa> fermata=l.newIterator(); fermata.inside(); fermata.goNext()) {
			double distanzaElemento;
			double latDistanza=latitudine-fermata.current().stop_lat;
			double lonDistanza=longitudine-fermata.current().stop_lon;
			distanzaElemento=Math.sqrt(latDistanza*latDistanza+lonDistanza*lonDistanza);
			if(distanzaElemento<distanza) {
				distanza=distanzaElemento; 
				finale=(PuntoMappa)fermata.current();
			}
		}
		return finale;
	}
	public void stampaFermata(){
		System.out.println("Sei vicino a "+l.get(pos).stop_name);
	}
}
