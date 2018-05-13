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
public class Esercizio4{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esercizio 4	
        Scanner input=new Scanner(System.in);
        System.out.println("Inserire prime 6 lettere dell'alfabeto");
        String[] elementi=new String[6];
        for(int i=0; i<6; i++){
            System.out.print("Dato "+(i+1)+": ");
            String elem=input.nextLine();
            elementi[i]=elem;
        }
        ListaConcatenata<String> lista=new ListaConcatenata<>(elementi);
        System.out.println("Lunghezza lista: "+lista.size());
	System.out.println("Lista di partenza: "+lista.toString());
        System.out.print("Aggiunta di un elemento in fondo alla lista: "+lista.toString()+" -> ");
        lista.addTail("g");
        System.out.println(lista.toString());
        System.out.println("Aggiunta di un elemento in testa alla lista: "+lista.toString()+" -> ");
        lista.addHead("z");
        System.out.println(lista.toString());
        System.out.println("Rimozione di un elemento in fondo alla lista: "+lista.toString()+" -> ");
        lista.removeTail();
        System.out.println(lista.toString());
        System.out.println("Rimozione di un elemento in testa alla lista: "+lista.toString()+" -> ");
        lista.removeHead();
        System.out.println(lista.toString());
        System.out.println("Recupero di un elemento data la posizone numero 1: "+lista.get(1));
        System.out.println("Settaggio di un elemento nella posizione numero 2: "+lista.toString()+" -> ");
        lista.set(2, "z");
        System.out.println(lista.toString());
        System.out.println("Aggiunta di un elemento nella posizione numero 3: "+lista.toString()+" -> ");
        lista.add(3, "w");
        System.out.println(lista.toString());
        System.out.println("Rimozione di un elemento nella posizione numero 3: "+lista.toString()+" -> ");
        lista.remove(3);
        System.out.println(lista.toString());
    }
    
}
