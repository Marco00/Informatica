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
public class Esercizio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pila");
        PilaConNodo<Integer> pila=new PilaConNodo<>();
        for(int i=1; i<6; i++){
            pila.push(i);
        }
        System.out.println("La pila è vuota? "+pila.isEmpty());
        System.out.println("Elemento rimosso dalla pila: "+pila.pop());
        System.out.println("Elemento in testa alla pila: "+pila.top());
        
        System.out.println("");
        System.out.println("Coda");
        CodaConNodo<Integer> coda=new CodaConNodo();
        for(int i=1; i<6; i++){
            coda.enqueue(i);
        }
        System.out.println("La coda è vuota? "+coda.isEmpty());
        System.out.println("Elemento rimosso dalla pila: "+coda.dequeue());
        System.out.println("Elemento in testa alla pila: "+coda.top());
    }
    
}
