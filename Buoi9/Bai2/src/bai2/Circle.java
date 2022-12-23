package bai2;

public class Circle implements IShape{
    private double radius;
    
    @Override
    public double getArea(){
        return (getRadius() *2)*3.14;
    }
    @Override
    public double getPerimeter(){
        return radius*radius*3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}
