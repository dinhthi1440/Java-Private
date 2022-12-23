package bai2;

import java.util.ArrayList;

public class RunMain {

    public static void main(String[] args) {
        Rectangle rec[] = new Rectangle[3];
        Circle cir[] = new Circle[3];
        rec[0] = new Rectangle(3, 4);
        rec[1] = new Rectangle(4, 4);
        rec[2] = new Rectangle(5, 4);
        
        cir[0] = new Circle(3);
        cir[1] = new Circle(4);
        cir[2] = new Circle(5);
        
        for (int i=0; i<rec.length; i++) {
            System.out.println("Chu vi hinh chu nhat thu " + i +" la: " + rec[i].getArea());
            System.out.println("Dien tich hinh chu nhat thu " + i +" la: " + rec[i].getPerimeter());
            System.out.println("");
        }
        
        for (int i=0; i<cir.length; i++) {
            System.out.println("Chu vi hinh tron thu " + i +" la: " +cir[i].getArea() );
            System.out.println("Dien tich hinh tron thu " + i +" la: "+ cir[i].getPerimeter());
            System.out.println("");
        }
        
    }
    
}
