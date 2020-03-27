package com.company;

import java.util.ArrayList;
//todo triangle validation;
public class Main {
    public static void main(String[] args) {
        ArrayList<Triangle> list;

        Triangle a = new Triangle(3, 5, 4);
        Triangle v = new Triangle(8, 4, 4); //triangle validation failed
        Triangle b = new Triangle(6, 10, 8);

        //	ArrayOfTriangles aa = new ArrayOfTriangles( a,b);
        v.getTypes();
        a.getTypes();
        b.getTypes();
        //	Triangle c = new Triangle(15,9,12);
        //	Triangle d = new Triangle(3,5,4);


    }
}
