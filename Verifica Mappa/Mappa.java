/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificamappa;
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
	public PuntoMappa search(double lat, double lon){
		double distanza=Math.sqrt(Math.pow(l.get(0).stop_lat-lat, 2)+Math.pow(l.get(0).stop_lon-lon, 2));
		double min=distanza;
		pos=0;
		for(int i=1; i<l.size(); i++){
			distanza=Math.sqrt(Math.pow(l.get(i).stop_lat-lat, 2)+Math.pow(l.get(i).stop_lon-lon, 2));
			if(distanza<min){
				min=distanza;
				pos=i;
			}
		}
		return l.get(pos);
	}
	public void stampaFermata(){
		System.out.println("Sei vicino a "+l.get(pos).stop_name);
	}
}
