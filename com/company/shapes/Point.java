package com.company.shapes;

/**
 * Created by Polina on 01.05.17.
 */
public class Point extends Shapes{
    double x;
    double y;
    Point(double x, double y)
    {
        this.x=x;
        this.y=y;
        System.out.println("Точка с координатами x:"+x+" y:"+y);
    }


}
