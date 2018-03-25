/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesional.L14.domain;

/**
 *
 * @author Taurus
 */
public class OverdraftException extends Exception{
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(double deficit, String message) {
        super(message);
        this.deficit = deficit;
    }
    
    
}
