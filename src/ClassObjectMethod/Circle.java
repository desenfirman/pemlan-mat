/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObjectMethod;

import java.util.Scanner;

/**
 *
 * @author desenfirman
 */
public class Circle {

    private double radius; 

    public void setRadius() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        radius = in.nextFloat();
    }
    

    double getPerimeter() {
        return Math.PI * 2 * radius; 
    }

    double getArea() {
        return Math.PI * Math.pow(radius,2);        
    }

}
