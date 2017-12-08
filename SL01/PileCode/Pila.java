/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilecode;

/**
 *
 * @author marco.pistollato
 */

//Esercizio 1
public class Pila {
	private char[] caratteri;
	private int n;
	private int counter=0;
	
	public Pila(int n){
		caratteri=new char[n];
		this.n=n;
	}
	
	public boolean isFull(){
            if(counter==n)
                return true;
            else
                return false;
	}
	
	public void push(char x){
		caratteri[counter]=x;
                counter++;
	}
	
	public char top(){
		return caratteri[counter-1];
	}
	
	public char pop(){
                counter--;
                char rimosso=caratteri[counter];
		char[] temp=new char[counter];
		for(int i=0; i<counter; i++){
			temp[i]=caratteri[i];
		}
                caratteri=temp;
		return rimosso;
	}
	
	public boolean isEmpty(){
		if(counter==0)
                    return true;
		else
                    return false;
	}
        public int getLunghezza(){
            return n;
        }
}
