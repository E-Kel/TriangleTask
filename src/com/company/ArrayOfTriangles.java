package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayOfTriangles {
    private ArrayList<Triangle> arrayOfTriangles;
    private HashMap typesFromEnum;

    public ArrayOfTriangles( Triangle... args){
        typesFromEnum = new HashMap<String, Integer>();
        for (TypesOfTriangles triangleType : TypesOfTriangles.values()){
            typesFromEnum.put(triangleType.toString(),0);
        }

        arrayOfTriangles = new ArrayList<>();
        for (int i  = 0; i< args.length; i++){
            arrayOfTriangles.add(i,args[i]);
            TriangleAnalysis(args[i]);
        }

    }
    public void TriangleAnalysis(Triangle triangle){
        ArrayList<TypesOfTriangles> temp = triangle.getTypes();
        for (TypesOfTriangles t: temp) {
            Integer tempNumber = 0;
            switch (t){
                case Scalene:
                    typesFromEnum.put("Scalene", +1);
                    break;
                case Isosceles:
                    typesFromEnum.put("Isosceles", +1);
                    break;
                case Equilateral:
                    typesFromEnum.put("Equilateral", +1);
                    break;
                case RightAngled:
                    typesFromEnum.put("RightAngled", +1);
                    break;
                case InvalidTriangle:
                    typesFromEnum.put("InvalidTriangle", +1);//todo print triangle with sides; findA LOWEST perimeter/area by key in hashMap; cout statistic - 1 hour
                    break;
            }
        }
        }


    static void makeStatisticOfTriangles(ArrayList<Triangle> ar){

    }
    static void printStatisticAboutTriangles(ArrayList<Triangle> ar) {

    }


}


