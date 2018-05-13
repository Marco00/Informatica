/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaiterabilemodellomvc;

/**
 *
 * @author Marco
 */
public class NodoConc<T> {
    T val;
    NodoConc<T> next;
    
    public NodoConc(T val, NodoConc next){
        this.val=val;
        this.next=next;
    }
}
