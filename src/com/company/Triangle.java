package com.company;

import java.util.ArrayList;

public class Triangle {
    private double sideAB; //A - 1, B -2, C -3
    private double sideBC;
    private double sideAC;

    private double perimeter;
    private double area;

    private ArrayList<TypesOfTriangles> types;


    public Triangle(double sideAB, double sideBC, double sideAC) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideAC = sideAC;
        if (verifyTriangle()) {

            this.perimeter = calculatePerimeter();
            this.area = calculateArea();
            defineTypesOfTriangle();
        } else {
            types = new ArrayList<>();
            types.add(TypesOfTriangles.InvalidTriangle);
            System.out.println("invalid triangle with sides" + " AB:" + sideAB + " BC:" + sideBC + " AC:" + sideAC);
        }
    }

    private boolean verifyTriangle() {
        return (sideBC + sideAB > sideAC && sideAB + sideAC > sideBC && sideBC + sideAC > sideAB);

    }

    private double calculatePerimeter() {
        return (sideAB + sideBC + sideAC);
    }

    private double calculateArea() {
        double halfPerimeter = perimeter / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideAB) * (halfPerimeter - sideAC) * (halfPerimeter - sideBC));
    }

    private void defineTypesOfTriangle() {
        types = new ArrayList<>();
        checkIsosceles();
        checkEquilateral();
        checkRightAngle();
        if (types.size() == 0) {
            types.add(TypesOfTriangles.Scalene);
        }


    }

    private void checkIsosceles() {
        if ((sideAB == sideBC) || (sideAB == sideAC) || (sideBC == sideAC)) {
            types.add(TypesOfTriangles.Isosceles);
        }
    }

    private void checkEquilateral() {
        if (sideAB == sideBC && sideAC == sideBC) {
            types.add(TypesOfTriangles.Equilateral);

        }
    }

    private void checkRightAngle() {
        if (
                isItHypo(sideAB, sideAC, sideBC) ||  //todo DRY
                        isItHypo(sideBC, sideAC, sideAB) ||
                        isItHypo(sideBC, sideAC, sideAB)) {
            types.add(TypesOfTriangles.RightAngled);
        }
    }

    private boolean isItHypo(double side1, double side2, double side3) {
        return (side1 == Math.sqrt(Math.pow(side2, 2) + Math.pow(side3, 2)));

    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public ArrayList<TypesOfTriangles> getTypes() {
        for (TypesOfTriangles type:
             types) {
            System.out.printf(type.toString()+ ", ");
        }
        System.out.println();
        return types;
    }
}

