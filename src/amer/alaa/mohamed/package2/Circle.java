/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amer.alaa.mohamed.package2;

import amer.alaa.mohamed.exceptions.AlaaException;

/**
 * @author moham
 */
public class Circle extends Shape {

    public Circle(int radius) throws AlaaException {
        super(radius);
    }

    public float calculateArea() {
        return getRadius() * getRadius();
    }

    public static void main(String[] args) {
        try {
            Circle circle = new Circle(90);
            double result =circle.calculateArea();
            System.out.println(result);
        } catch (AlaaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}