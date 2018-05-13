/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatti;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author marco.pistollato
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("E:\\4^SUPERIORE\\Informatica\\Q1\\Contatti\\src\\contatti\\google.csv");
        Scanner scan = new Scanner(file1);

        String c = scan.nextLine();
        for (int i = 0; i < 30; i++) {
            System.out.println(c.charAt(i));
        }
    }

}
