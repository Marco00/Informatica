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
public class PilaConNodo<T> implements Crossable{

    NodoConc<T> testa;
    int n = 0;

    public PilaConNodo() {
        testa = null;
    }

    public void push(T x) {
        NodoConc nuovaTesta = new NodoConc(x, null);
        if (testa == null) {
            testa = nuovaTesta;
        } else {
            nuovaTesta.next = testa;
            testa = nuovaTesta;
        }
        n++;
    }

    public NodoConc pop() {
        NodoConc<T> rimosso = null;
        if (isEmpty()) {
            System.out.println("La pila è vuota");
        } else {
            rimosso = testa;
            testa = testa.next;
            n--;
        }
        return rimosso;
    }

    public NodoConc top() {
        if (isEmpty()) {
            return null;
        } else {
            return testa;
        }
    }

    public boolean isEmpty() {
        if (n > 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getLunghezza() {
        return n;
    }

    public T getElement(int n) {
        NodoConc<T> temp = testa;
        if (testa == null) {
            System.out.println("La pila è vuota");
        } else {
            for (int i = 0; i < n; i++) {
                temp = temp.next;
            }
        }
        return temp.val;
    }

    @Override
    public Iteratore newIterator() {
        return new Iteratore(this);
    }
}
