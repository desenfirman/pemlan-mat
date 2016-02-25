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
public class CircleTest {
    public static void main(String[] args) {
        Circle circ = new Circle();
        circ.setRadius();
        
        System.out.println("Luas: " + circ.getArea());
        System.out.println("Keliling: " + circ.getPerimeter());
    }
}
