/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificamappaiteratore;

/**
 *
 * @author marco.pistollato
 */
public class NodoConc<T> {
	public T info;
	public NodoConc<T> next;
	NodoConc(T info, NodoConc next){
		this.info=info;
		this.next=next;
	}
}
