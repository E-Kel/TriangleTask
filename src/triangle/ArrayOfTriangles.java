package triangle;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayOfTriangles {
    private ArrayList<Triangle> arrayOfTriangles;
    private ArrayList[] typesFromEnum;
    private ArrayList statisticByType;

    public ArrayOfTriangles( Triangle... args){
        //type,amount,biggest/lowest area,biggest/lowest perimeter
        int i = 0;
        for (TypesOfTriangles triangleType : TypesOfTriangles.values()){
            typesFromEnum[i] = new ArrayList<Object>();
            typesFromEnum[i].add(i,triangleType.toString());
            i+=1;
        }

        arrayOfTriangles = new ArrayList<>();
        for (i  = 0; i< args.length; i++){
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
                    typesFromEnum.add("Scalene", +1);
                    break;
                case Isosceles:
                    typesFromEnum.add("Isosceles", +1);
                    break;
                case Equilateral:
                    typesFromEnum.add("Equilateral", +1);
                    break;
                case RightAngled:
                    typesFromEnum.add("RightAngled", +1);
                    break;
                case InvalidTriangle:
                    typesFromEnum.add("InvalidTriangle", +1);
                    //todo print triangle with sides;
                    // findA LOWEST perimeter/area by key in hashMap;
                    // cout statistic - 1 hour
                    break;
            }
        }
        }


    static void makeStatisticOfTriangles(ArrayList<Triangle> ar){

    }
    static void printStatisticAboutTriangles(ArrayList<Triangle> ar) {

    }


}


