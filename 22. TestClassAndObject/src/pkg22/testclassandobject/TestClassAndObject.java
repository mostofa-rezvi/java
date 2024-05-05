package pkg22.testclassandobject;

import geomatry.Circle;

public class TestClassAndObject {
    
    public static void main(String[] args) {
        
        // Circle circle = new Circle();
        Circle circle = new Circle(5);
        
        // circle.setRadious(5);
        
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
    }
    
}
