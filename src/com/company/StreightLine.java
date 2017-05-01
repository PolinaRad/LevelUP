package com.company.shapes;

import java.util.Scanner;

/**
 * Created by Polina on 01.05.17.
 */
public class StreightLine extends Shapes
{   double x;
    double y;
    StreightLine(double x, double y)
    {
    this.x=x;
    this.y=y;
        System.out.println("Прямая Ax+By+C=0");
    }
    static void Parametres()
    {
        System.out.println("Введите значение А:");
        Scanner scanner=new Scanner(System.in);
        double A=scanner.nextDouble();
        System.out.println("Введите значение В:");
        double B=scanner.nextDouble();
        System.out.println("Введите значение С:");
        double C=scanner.nextDouble();
        System.out.println(" "+A+"x+"+" "+B+"y+"+C+"=0");
    }


}