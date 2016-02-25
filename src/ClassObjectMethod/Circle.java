/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObjectMethod;



/**
 *
 * @author desenfirman
 */
public class Circle {

    private double radius; 

    public void setRadius(double radii) {
        radius= radii;
    }
    
    
    double getPerimeter() {
        return Math.PI * 2 * radius; 
    }

    double getArea() {
        return Math.PI * Math.pow(radius,2);        
    }

}
