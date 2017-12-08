/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilecode;

/**
 *
 * @author Marco
 */
public class Esercizio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coda coda=new Coda(4);
        Pila pila=new Pila(4);
        coda.enqueue('a');
        coda.enqueue('b');
        coda.enqueue('c');
        coda.enqueue('d');
        System.out.println("Elemento in testa alla coda: "+coda.front());
        for(int i=0; i<coda.getLunghezza(); i++){
            pila.push(coda.front());
            coda.dequeue();
        }
        System.out.println("Elemento in testa alla pila: "+pila.top());
    }
    
}
