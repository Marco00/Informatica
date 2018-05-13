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

//Esercizio 2
public class Coda {
	private char[] caratteri;
	private int n;
	private int counter=0;
	
	public Coda(int n){
		this.caratteri=new char[n];
		this.n=n;
	}
	
	public boolean isFull(){
		if(counter==n)
                    return true;
		else
                    return false;
	}
	
	public void enqueue(char x){
		char[] temp=new char[counter+1];
                if(counter>0){
                    for(int i=0; i<counter; i++){
                        temp[i+1]=caratteri[i];
                    }
                }
                temp[0]=x;
                caratteri=temp;
                counter++;
	}
	
	public char front(){
		return caratteri[counter-1];
	}
	
	public char dequeue(){
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
