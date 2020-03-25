package com.company;

//todo: triangle verification
public class Triangle {
    private double sideAB; //A - 1, B -2, C -3
    private double sideBC;
    private double sideAC;

    public Triangle(double sideAB, double sideBC, double sideAC) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideAC = sideAC;
    }

    public double calculatePerimeter(){return (sideAB + sideBC + sideAC);}
    public double calculateArea() {
        double perimeter = calculatePerimeter();
        return Math.sqrt((perimeter - sideAB) * (perimeter - sideAC) * (perimeter - sideBC));
    }

}

