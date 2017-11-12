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
public class TestAlberoBinConNodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlberoBin tree=new AlberoBin(5, new NodoBin(2, null, null), new NodoBin(3, new NodoBin(17, null, null), null));
        System.out.println("L'albero è vuoto? Risposta: "+tree.isEmpty());
        ListaConcatenata l1=new ListaConcatenata();
        ListaConcatenata l2=new ListaConcatenata();
        ListaConcatenata l3=new ListaConcatenata();
        tree.visitaSimmetrica(tree.radice, l1);
        System.out.println("Visita simmetrica "+l1.toString());
        tree.visitaAnticipata(tree.radice, l2);
        System.out.println("Visita anticipata "+l2.toString());
        tree.visitaPosticipata(tree.radice, l3);
        System.out.println("Visita posticipata "+l3.toString());
    }
}
