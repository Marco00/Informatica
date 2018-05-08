/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionegraficaconawt;

import static gestionegraficaconawt.AscoltatoreBtn.creazioneLayout;
import static gestionegraficaconawt.AscoltatoreBtn.load;
import java.io.FileNotFoundException;

/**
 *
 * @author marco.pistollato
 */
public class GestioneGraficaConAWT {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) throws FileNotFoundException {
        creazioneLayout();
        load("input.txt");
    }
}
