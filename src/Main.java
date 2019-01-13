import java.math.*;
import java.util.Scanner;

interface Shape{
    double PI=3.14;
    double area();
}

class Triangle implements Shape{
    private double a,b,c;
    Triangle(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r=r;
    }
     @Override
    public double area(){
        return PI*r*r;
     }
}

public class Main {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("输入三角形的边长a");
        double a = in.nextDouble();
        System.out.println("输入三角形的边长b");
        double b = in.nextDouble();
        System.out.println("输入三角形的边长c");
        double c = in.nextDouble();
        Triangle triangle=new Triangle(a,b,c);
        System.out.println("三角形面积为：" + triangle.area());
        System.out.println("输入圆的半径r:");
        double r = in.nextDouble();
        Circle circle=new Circle(r);
        System.out.println("圆的面积为:" + circle.area());
        in.close();
    }
}
