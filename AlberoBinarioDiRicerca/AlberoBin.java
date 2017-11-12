/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalberobinariodiricerca;
/**
 *
 * @author Marco
 */
public class AlberoBin<T extends Comparable<T>>{
    NodoBin<T> radice;
    public AlberoBin() {
	this.radice=null;
    }
    public AlberoBin(T info, NodoBin sx, NodoBin dx) {
        radice=new NodoBin(info, sx, dx);
    }
    public T getInfo() {
	return radice.info;
    }
    public NodoBin getLeft() {
	return radice.left;
    }
    public NodoBin getRight() {
	return radice.right;
    }
    public boolean isEmpty() {
	if(radice == null)
            return true;
	else
            return false;
    }
    public void addElem(T elem){
        //System.out.println(elem);
	NodoBin<T> temp=null;
	boolean verifica=false;
	if(isEmpty()){
            radice=new NodoBin(elem ,null, null);
            //System.out.println("creata radice "+radice.info);
        } else {
            temp=radice;
            while(verifica==false){
		if(elem.compareTo(temp.info)<0){
                    if(temp.left==null){
			temp.left=new NodoBin(elem, null, null);
                        temp=temp.left;
                        //System.out.print("info "+temp.info);
			//System.out.println("    è stata creata a sinistra");
			verifica=true;
                    } else {
                        temp=temp.left;
                        //System.out.println("temp è posizionato su "+temp.info+". Si è mosso a sinistra");
                    }
                } else {
                    if(elem.compareTo(temp.info)>0){
                        if(temp.right==null){
                            temp.right=new NodoBin(elem, null, null);
                            temp=temp.right;
                            //System.out.print("info "+temp.info);
                            //System.out.println("    è stata creata a destra");
                            verifica=true;
                        } else {
                            temp=temp.right;
                            //System.out.println("temp è posizionato su "+temp.info+". Si è mosso a destra");
                        }
                    } else {
                        System.out.println("ATTENZIONE!"+elem+" è un elemento già esistente: non inserito all'interno dell'albero");
                        verifica=true;
                    }
                }
            }
        }
        /**
        System.out.println("");
        System.out.println("fatto");
        System.out.println("");
        */
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
