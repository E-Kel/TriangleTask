package com.company;

import java.util.ArrayList;

//todo: triangle verification
public class Triangle {
    private double sideAB; //A - 1, B -2, C -3
    private double sideBC;
    private double sideAC;

    private double perimeter;
    private double area;

    private ArrayList<TypesOfTriangles> types= new ArrayList<TypesOfTriangles>();


    public Triangle(double sideAB, double sideBC, double sideAC) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideAC = sideAC;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
        defineTypesOfTriangle();
    }

    private double calculatePerimeter() {
        return (sideAB + sideBC + sideAC);
    }

    private double calculateArea() {
        double halfPerimeter = perimeter / 2;
        return Math.sqrt((halfPerimeter - sideAB) * (halfPerimeter - sideAC) * (halfPerimeter - sideBC));
    }

    private void defineTypesOfTriangle() {
        if (checkRightAngle()) {
             types.add(TypesOfTriangles.RightAngled);
        }
        else if (checkEquilateral()) {
            types.add(TypesOfTriangles.Equilateral);
        }
        else if (checkIsosceles()) {
            types.add(TypesOfTriangles.Isosceles);
        } else
            types.add(TypesOfTriangles.Scalene);
    }

    private boolean checkIsosceles() {
        if ((sideAB == sideBC) || (sideAB == sideAC) || (sideBC == sideAC)){
            return true;
        }else return false;
    }

    private boolean checkEquilateral() {
        if (sideAB == sideBC && sideAC == sideBC)
            return true;
        else
            return false;
    }
    private boolean checkRightAngle() {
        if (
                isItHypo(sideAB, sideAC, sideBC) ||  //todo DRY
                isItHypo(sideBC, sideAC, sideAB) ||
                isItHypo(sideBC, sideAC, sideAB)
        )
            return true;
        else
            return false;
    }
    private boolean isItHypo(double side1, double side2, double side3) {
        boolean _ = (side1 == Math.sqrt(Math.pow(side2, 2) + Math.pow(side3, 2)));
        return _;
    }


    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public ArrayList<TypesOfTriangles> getTypes() {

        for (TypesOfTriangles t: types) {
            System.out.println(t);

        }
        return types;
    }


}

