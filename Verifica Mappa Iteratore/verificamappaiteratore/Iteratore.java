/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificamappaiteratore;

/**
 *
 * @author Marco
 */
public class Iteratore<T> implements Iterator{
    private ListaConcatenata<NodoConc> contenitore;
    private NodoConc<T> element;
    public Iteratore(ListaConcatenata lista) {
		contenitore=lista;
		goFirst();
    }
    @Override
    public boolean inside() {
    	if(element!=null)
            return true;
        else
            return false;
    }
    @Override
    public T current() {
	if(inside()) 
            return element.info;
        else 
            return (T) "Non è all'interno del contenitore";
    }
    @Override
    public void goNext() {
		if(inside()) 
            element=element.next;
    }
    @Override
    public void goFirst() {
		if(inside())
			element=contenitore.get(0);
    }
}
