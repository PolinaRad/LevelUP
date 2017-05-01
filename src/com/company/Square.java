package com.company.shapes;

/**
 * Created by Polina on 01.05.17.
 */
public class Square extends Shapes{
    double x;
    Square(double x)
    {
        this.x=x;
        super.area(x,x);
    }
}
