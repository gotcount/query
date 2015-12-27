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
public class RangeQuery<T> extends AbstractQuery<T> {

    private final T lowerBound;
    
    private final boolean incLowerBound;
    
    private final T upperBound;
    
    private final boolean incUpperBound;

    public RangeQuery(Class<T> type, T lowerBound, T upperBound) {
        this(type, lowerBound, true, upperBound, false);
    }

    public RangeQuery(Class<T> type, T lowerBound, boolean incLowerBound, T upperBound, boolean incUpperBound) {
        super(type);
        this.lowerBound = lowerBound;
        this.incLowerBound = incLowerBound;
        this.upperBound = upperBound;
        this.incUpperBound = incUpperBound;
    }

    public T getLowerBound() {
        return lowerBound;
    }

    public boolean isIncLowerBound() {
        return incLowerBound;
    }

    public T getUpperBound() {
        return upperBound;
    }

    public boolean isIncUpperBound() {
        return incUpperBound;
    }
    
    public boolean hasUpperBound() {
        return upperBound != null;
    }
    
    public boolean hasLowerBound() {
        return lowerBound != null;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("RangeQuery:");
        if (hasLowerBound() && hasUpperBound()) {
            b.append(incLowerBound ? "[ " : "{ ");
            b.append(lowerBound);
            b.append(" - ");
            b.append(upperBound);
            b.append(incUpperBound ? " ]" : " }");
        } else {
            if (hasLowerBound()) {
                b.append(incLowerBound ? ">= " : "> ");
                b.append(lowerBound);
            } else {
                b.append(incUpperBound ? "<= " : "< ");
                b.append(upperBound);
            }
        }
        return b.toString();
    }
        
}
