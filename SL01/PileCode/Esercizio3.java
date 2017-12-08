/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilecode;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Esercizio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Inserire parola da analizzare: ");
        String parola=input.nextLine();
        int first, second;
        if(parola.length()%2==0)
            first=parola.length()/2;
        else 
            first=parola.length()/2+1;
        second=parola.length()-first;
        Coda coda=new Coda(first);
        Pila pila=new Pila(second);
        for(int i=0; i<first; i++){
            coda.enqueue(parola.charAt(i));
        }
        for(int i=first; i<parola.length(); i++){
            pila.push(parola.charAt(i));
        }
        boolean verifica=false;
        for(int i=0; i<second; i++){
            if(pila.top()==coda.front()){
                verifica=true;
                pila.pop();
                coda.dequeue();
            }
            else {
                verifica=false;
                break;
            }
        }
        System.out.println("La parola è palindrome? Risposta: "+verifica);
    }
    
}
