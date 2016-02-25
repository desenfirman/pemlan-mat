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
public class CircleTest {
    public static void main(String[] args) {
        Circle circ = new Circle();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jari - jari: ");
        circ.setRadius(in.nextDouble());
        
        System.out.println("Luas: " + circ.getArea());
        System.out.println("Keliling: " + circ.getPerimeter());
    }
}
