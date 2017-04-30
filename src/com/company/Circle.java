package com.company;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Circle
{
    double x;
    double y;
    double r;
    private double nr;


    Circle()
      {
          System.out.println("Введите координаты точки:");
          Scanner scanner = new Scanner(System.in);
          double x = scanner.nextDouble();
          double y = scanner.nextDouble();
          this.x =x;
          this.y=y;
          System.out.println("Введите радиус окружности:");
          double r = scanner.nextDouble();
          this.r=r;
          //r = Math.pow(x*x+y*y,0.5);
  
      }
     
 /* Circle( double r)
  {
      this.x=0;
      this.y=0;
      this.r=r;
      //r = Math.pow(x*x+y*y,0.5);

  }*/

    void move ()
    { System.out.println("Введите изменения координат центра:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("dx:");
        double dx = scanner.nextDouble();
        System.out.println("dy:");
        double dy = scanner.nextDouble();
        x+=dx;
        y+=dy;

    }

    double area ()
    {
        return PI*Math.pow(r,2);

    }


    public void cahngeR() {
        System.out.println("Введите на сколько увеличить радиус:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("dr:");
        double dr = scanner.nextDouble();
        r += dr;

    }

    public void changeNR() {
        System.out.println("Введите во раз сколько увеличить радиус:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("NR:");
        double nr = scanner.nextDouble();
        r=Math.pow(r,nr);
    }

    public void checkPoint() {
        System.out.println("Введите координаты точки:");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        if (((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)) < r * r) {
            System.out.println("Точка принадлежит окружности.");
        } else if (((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)) == r * r) {
            System.out.println("Точка лежит на окружности.");
        } else
            System.out.println("Точка не принадлежит окружности.");

    }

    public double lengh() {
        return 2*PI*r;
    }

    public double diameter() {
        return 2*r;
    }

    public void about() {
        System.out.println("Радиус: " + r);
        System.out.println("Центр окружности по оси x: " +(x));
        System.out.println("Центр окружности по оси y: " +(y));
    }
}
