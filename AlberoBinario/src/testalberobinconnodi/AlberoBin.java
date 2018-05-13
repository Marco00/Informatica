/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalberobinconnodi;

/**
 *
 * @author Marco
 */
public class AlberoBin<T> {
    NodoBin radice;
    public AlberoBin() {
	this.radice=null;
    }
    public AlberoBin(T info, NodoBin sx, NodoBin dx) {
        radice=new NodoBin(info, sx, dx);
    }
    public T getInfo() {
	return (T)radice.info;
    }
    public NodoBin getLeft() {
	return radice.left;
    }
    public NodoBin getRight() {
	return radice.right;
    }
    public boolean isEmpty() {
	return (radice.right == null && radice.left == null && radice.info == null);
    }
    public void visitaSimmetrica(NodoBin nodo, ListaConcatenata li) {
	if(nodo.left != null)
            visitaSimmetrica(nodo.left, li);
        li.addTail((T)nodo.info);
        if(nodo.right != null)
            visitaSimmetrica(nodo.right, li);
    }
    public void visitaAnticipata(NodoBin nodo, ListaConcatenata li) {
	li.addTail((T)nodo.info);
        if(nodo.left != null)
            visitaSimmetrica(nodo.left, li);
        if(nodo.right != null)
            visitaSimmetrica(nodo.right, li);
    }
    public void visitaPosticipata(NodoBin nodo, ListaConcatenata li) {
        if(nodo.left != null)
            visitaSimmetrica(nodo.left, li);
        if(nodo.right != null)
            visitaSimmetrica(nodo.right, li);
        li.addTail((T)nodo.info);
    }
}
