package gestionegraficaconawt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static gestionegraficaconawt.AscoltatoreBtn.array;

class AscoltatoreWin extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
            try {
                PrintWriter out=new PrintWriter("output.txt");
                for(int i=0; i<array.length; i++){
                    out.println(array[i]);
                }
                out.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            System.out.println("Chiusura");
            System.exit(0);
	}
	
}
