package com.company;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Triangle> list;

        Triangle a = new Triangle(3, 5, 4);
        Triangle v = new Triangle(8, 4, 4); //triangle validation failed
        Triangle b = new Triangle(6, 10, 8);
        Triangle d = new Triangle(6, 6, 6);
        Triangle c = new Triangle(3 , 6, 4);
        Triangle e = new Triangle(22.63, 16, 16);

        ArrayOfTriangles n = new ArrayOfTriangles(a,v,b);
        n.TriangleAnalysis(d);
        n.TriangleAnalysis(b);
        n.TriangleAnalysis(c);

        //	ArrayOfTriangles aa = new ArrayOfTriangles( a,b);
//        v.getTypes();
//        a.getTypes();
//        b.getTypes();
//        d.getTypes();
//        c.getTypes();
//        e.getTypes();
        //	Triangle c = new Triangle(15,9,12);
        //	Triangle d = new Triangle(3,5,4);


    }
}
