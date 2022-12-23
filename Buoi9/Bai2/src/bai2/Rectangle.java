package bai2;

public class Rectangle implements IShape{
    private double length, width;

    @Override
    public double getArea(){
        return (length+width)*2;
    }
    @Override
    public double getPerimeter(){
        return length*width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    
}
