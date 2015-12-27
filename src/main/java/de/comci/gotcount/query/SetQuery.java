/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.comci.gotcount.query;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Sebastian Maier (sebastian.maier@comci.de)
 */
public class SetQuery<T> extends AbstractQuery<T> {

    private final Set<T> values;
    
    private final boolean any;

    public SetQuery(Class<T> type, Set<T> values, boolean any) {
        super(type);
        if (values == null) {
            this.values = new HashSet<>();
        } else {
            this.values = values;
        }
        this.any = any;
    }
    
    public SetQuery(Class<T> type, Set<T> values) {
        this(type, values, false);        
    }

    public Set<T> getValues() {
        return values;
    }

    public boolean acceptAny() {
        return any;
    }
    
    public boolean requireAll() {
        return !any;
    }
    
    public int size() {
        return values.size();
    }
    
    @Override
    public String toString() {
        return String.format("SetQuery:%s{%s}", 
                any ? "any" : "all", 
                values.stream()
                    .limit(3)
                    .map(t -> t != null ? t.toString() : "null")                
                    .collect(Collectors.joining(","))
        );
    }
    
}
