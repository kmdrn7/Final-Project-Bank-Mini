/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleware;

/**
 *
 * @author kmdr7
 */
public interface ShouldAuthenticated {

    public abstract boolean login(String username, String password);
    
}
