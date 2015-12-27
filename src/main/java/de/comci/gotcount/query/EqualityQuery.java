/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.comci.gotcount.query;

/**
 *
 * @author Sebastian Maier (sebastian.maier@comci.de)
 */
public class EqualityQuery<T> extends AbstractQuery<T> {

    private final T value;

    public EqualityQuery(Class<T> type, T value) {
        super(type);
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "EqualityQuery{" + "=" + value + '}';
    }
    
}
