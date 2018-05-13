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
public class PilaConNodo<T> {
    
    private NodoConc<T> testa;
    private int n=0;
    
    public PilaConNodo(){
        testa=null;
    }
    
    public void push(T x){
        NodoConc nuovaTesta=new NodoConc(x, null);
        if(testa==null)
            testa=nuovaTesta;
        else{
            nuovaTesta.next=testa;
            testa=nuovaTesta;
        }
        n++; 
    }
    public T pop(){
        NodoConc<T> rimosso=null;
        if(isEmpty()){
            System.out.println("La pila è vuota");
        } else {
            rimosso=testa;
            testa=testa.next;
            n--;
        }
        return rimosso.val;
    }
    public T top(){
        return testa.val;
    }
    public boolean isEmpty(){
        if(n>0)
            return false;
        else
            return true;
    }
    public int getLunghezza(){
        return n;
    }
}