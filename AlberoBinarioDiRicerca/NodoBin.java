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
public class NodoBin<T> {
    public T info;
    public NodoBin<T> left, right;
    public NodoBin(T info, NodoBin left, NodoBin right){
        this.info=info;
        this.left=left;
        this.right=right;
    }
}
