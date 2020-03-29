package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayOfTriangles {
    private static HashMap typesAndAmount = new HashMap();
    private ArrayList<Triangle> arrayOfTriangles;
    private TypesOfTriangles types;

    public ArrayOfTriangles( Triangle... args){
         arrayOfTriangles = new ArrayList<Triangle>();
        for (int i  = 0; i< args.length; i++){
            arrayOfTriangles.add(i,args[i]);
        }
    }

    static void makeStatisticOfTriangles(ArrayList<Triangle> ar){

    }
    static void printStatisticAboutTriangles(ArrayList<Triangle> ar) {

    }

    private void setTypes() {
        //Equilateral-1,Isosceles-2,RightAngle-3, Scalene-4
         //todo make possibility of multiple output

    }

}
