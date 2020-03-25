package com.company;

public class Triangle {
    Dot a, b, c;
    double sideAB = Dot.claculateDistanceBTWTwoPoints(a,b);
    double sideBC= Dot.claculateDistanceBTWTwoPoints(b, c);
    double sideAC= Dot.claculateDistanceBTWTwoPoints(a,c);
    double perimeter = sideAB+sideBC+sideAC;
    double area = calculateAreaOfTriangle();

    private double calculateAreaOfTriangle(Dot){

    }
}

