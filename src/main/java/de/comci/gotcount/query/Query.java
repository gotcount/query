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
public interface Query<T> {
    
    Class<T> getType();
    
}
