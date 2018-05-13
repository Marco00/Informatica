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
public class Iteratore<T> implements Iterator {

    private PilaConNodo contenitore;
    private NodoConc<T> element;

    public Iteratore(PilaConNodo pila) {
        contenitore = pila;
        goFirst();
    }

    @Override
    public boolean inside() {
        if (element != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T current() {
        if (inside()) {
            return element.val;
        } else {
            return (T) "vuoto";
        }
    }

    @Override
    public void goNext() {
        if (inside()) {
            element = element.next;
        } else {
            System.out.println("Pila vuota!");
        }
    }

    @Override
    public void goFirst() {
        element = contenitore.top();
    }
}
