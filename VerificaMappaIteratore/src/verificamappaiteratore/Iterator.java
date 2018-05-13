/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificamappaiteratore;

/**
 *
 * @author Marco
 */
public interface Iterator<T> {
    boolean inside();
    T current();
    void goNext();
    void goFirst();
}
