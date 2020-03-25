package com.company;
import com.company.Util;
//todo: triangle verification
public class Triangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    private double sideAB = Util.claculateDistanceBTWTwoPoints(x1,y1,x2,y2); //A - 1, B -2, C -3
    private double sideBC = Util.claculateDistanceBTWTwoPoints(x2,y2,x3,y3);
    private double sideAC = Util.claculateDistanceBTWTwoPoints(x1,y1,x3,y3);

    private double perimeter = sideAB + sideBC + sideAC;
    private double area = Math.sqrt((perimeter - sideAB) * (perimeter - sideAC) * (perimeter - sideBC));

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

}

