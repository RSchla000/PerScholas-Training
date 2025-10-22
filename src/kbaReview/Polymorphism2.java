package kbaReview;

abstract class Shape{
    public abstract double area();
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){this.radius = radius;}
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    private double width, height;
    public Rectangle(double w, double h){width = w; height =h;}
    @Override
    public double area(){
        return width*height;
    }
}

public class Polymorphism2 {
    static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(3,4);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
    }
}
