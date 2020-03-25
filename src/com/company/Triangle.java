package com.company;

//todo: triangle verification
public class Triangle {
    Dot a, b, c;
    public Triangle(double x1,double y1, double x2,double y2, double x3,double y3){
        a = new Dot(x1,y1);
        b = new Dot(x2,y2);
        c = new Dot(x3,y3);
    }
    private double sideAB = Dot.claculateDistanceBTWTwoPoints(a, b);
    private double sideBC = Dot.claculateDistanceBTWTwoPoints(b, c);
    private double sideAC = Dot.claculateDistanceBTWTwoPoints(a, c);

    private double perimeter = sideAB + sideBC + sideAC;
    private double area = Math.sqrt((perimeter - sideAB) * (perimeter - sideAC) * (perimeter - sideBC));

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

}

