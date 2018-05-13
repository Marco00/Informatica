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
public class CodaConNodo<T> {
    private NodoConc<T> top, back;
    private int n;
    
    public CodaConNodo(){
        top=back=null;
    }
    
    public void enqueue(T x){
        NodoConc nuovaTesta=new NodoConc(x, null);
        if(top==null)
            top=back=nuovaTesta;
        else{
            back.next=nuovaTesta;
            back=nuovaTesta;
        }
        n++; 
    }
    public T dequeue(){
        NodoConc<T> rimosso=null;
        if(isEmpty())
            System.out.println("La pila è vuota");
        else{ 
            rimosso=top;
            top=top.next;
            n--;
        }
        return rimosso.val;
    }
    public T top(){
        return top.val;
    }
    public int getLunghezza(){
        return n;
    }
    public boolean isEmpty(){
        if(n>0)
            return false;
        else
            return true;
    }
}
