package com.company;

import java.util.ArrayList;

public class ArrayOfTriangles {
    private ArrayList<Triangle> arrayOfTriangles;
    public ArrayOfTriangles(Triangle [] args){
        for (int i  = 0; i< args.length; i++){
            this.arrayOfTriangles.add(i,args[i]);
        }
    }

}
