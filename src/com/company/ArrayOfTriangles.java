package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayOfTriangles {
    private ArrayList<Triangle> arrayOfTriangles = new ArrayList<Triangle>();
    public ArrayOfTriangles( Triangle... args){
        for (int i  = 0; i< args.length; i++){
            this.arrayOfTriangles.add(i,args[i]);
        }
    }
    static void printInfAboutTriangles(ArrayList<Triangle> ar){

    }
    private int countTypes(){
        HashMap types = new HashMap();//Equilateral-1,Isosceles-2,RightAngle-3, Scalene-4
        for (Triangle tr:arrayOfTriangles)

        return 1;
        return 0;
    }

}
