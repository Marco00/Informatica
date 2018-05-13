/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatti;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author marco.pistollato
 */
public class Contatti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("E:\\4^SUPERIORE\\Informatica\\Q1\\Contatti\\src\\contatti\\google.csv");
        Scanner scan = new Scanner(file1);
        ListaConcatenata<Contatto> lista = new ListaConcatenata<>();
        Contatto c;
        int[] pos = {0, 1, 3, 28};
        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            String[] campi = new String[29];
            String parola = "";
            int j = 0;
            for (int i = 0; i < linea.length(); i++) {
                if (i == linea.length() - 1) {
                    parola = parola + linea.charAt(i);
                    campi[j] = parola;
                    break;
                }
                if (linea.charAt(i) != ',') {
                    parola = parola + linea.charAt(i);
                } else {
                    campi[j] = parola;
                    parola = "";
                    j++;
                }
            }
            c = new Contatto(campi[pos[0]], campi[pos[1]], campi[pos[2]], campi[pos[3]]);
            System.out.print(c.getPersona() + ", ");
            System.out.print(c.getNome() + ", ");
            System.out.print(c.getCognome() + ", ");
            System.out.println(c.getEmail());
            lista.addTail(c);
        }
        scan.close();
        lista.removeHead();
    }
}
