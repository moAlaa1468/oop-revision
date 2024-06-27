package amer.alaa.mohamed.package2;

import amer.alaa.mohamed.exceptions.AlaaException;

public class Shape {
    private int radius;
    private double side;

    //Just empty constructor uaAlaa
    Shape() throws AlaaException {
        setRadius(1);
        setRadius(1);
    }


    //This is another kind to handle exception
    Shape(double side) throws AlaaException {
        this.setRadius(side);
    }

    //This is a kind to handle exceptions via Constructor uaAmer
    Shape(int radius) throws AlaaException {
        if (radius < 0) {
            System.out.println("Enter a positive number for radius");
            throw new AlaaException("The value of the radius is negative uaAlaaa ");
        } else {
            this.radius = radius;
        }

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws AlaaException {
        if (radius < 0) {
            System.out.println("Enter a positive number for radius");
            throw new AlaaException("The value of the radius is negative uaAlaaa ");
        } else {
            this.radius = radius;
        }
    }

    public void setRadius(double side) throws AlaaException {
        if (radius < 0) {
            System.out.println("Enter a positive number for radius");
            throw new AlaaException("The value of the radius is negative uaAlaaa ");
        } else {
            this.side = side;
        }
    }
}
