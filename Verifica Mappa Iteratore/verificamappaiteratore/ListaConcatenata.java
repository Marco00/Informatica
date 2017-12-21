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
public class ListaConcatenata<T> implements Crossable{
	NodoConc<T> testa, coda;
	public ListaConcatenata(){
		testa=coda=null;
	}
	public void aggiungiFermata(T elem){
		NodoConc daAggiungere=new NodoConc(elem, null);
		if(size()==0)
			testa=coda=daAggiungere;
		else{
			coda.next=daAggiungere;
			coda=daAggiungere;
		}
	}
	public int size(){
		if(testa==null)
			return 0;
		NodoConc temp=testa;
		int i=0;
		while(!temp.equals(coda)){
			temp=temp.next;
			i++;
		}
		return ++i;
	}
	public T get(int n){
		NodoConc<T> temp=testa;
		for(int i=0; i<n; i++){
			temp=temp.next;
		}
		return temp.info;
	}
        @Override
        public Iteratore newIterator() {
            return new Iteratore(this);
        }
}
