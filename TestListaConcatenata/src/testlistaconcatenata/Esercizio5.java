/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlistaconcatenata;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Esercizio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esercizio 5
        ListaConcatenata l=new ListaConcatenata();
        System.out.println(analizzaTesto(l));
    }
    static ListaConcatenata analizzaTesto(ListaConcatenata lista) {
        Scanner input=new Scanner(System.in);
        ListaConcatenata<String> list = new ListaConcatenata();
        String testo, elem ="";
        System.out.println("Inserire testo:");
        testo=input.nextLine();
        ListaConcatenata posizioniChiocciola=new ListaConcatenata<>();
        int j=0;
        for(int i=0; i<testo.length(); i++){
            if(testo.charAt(i)==' '|testo.charAt(i)==','|testo.charAt(i)==';'|testo.charAt(i)=='.'|testo.charAt(i)=='?'|testo.charAt(i)=='"'|testo.charAt(i)==':'|testo.charAt(i)=='_'|testo.charAt(i)=='-'|testo.charAt(i)=='@'){
                if(elem.length()!=0){
                    list.addTail(elem);
                    j++;
                    elem="";
                }
                if(testo.charAt(i)=='@'){
                    list.addTail(""+testo.charAt(i));
                    posizioniChiocciola.addTail(j);
                    j++;
                }
            } else
                elem=elem+testo.charAt(i);
        }
        if(posizioniChiocciola.size()!=0)
            for(int i=0; i<posizioniChiocciola.size(); i++){
                System.out.println("Trovata "+list.get((int)posizioniChiocciola.get(i)));
                list.remove((int)posizioniChiocciola.get(i));
            }
        return list;
    }
}
