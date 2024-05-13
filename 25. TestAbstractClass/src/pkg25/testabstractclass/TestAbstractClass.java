package pkg25.testabstractclass;

import geomatry.Circle;
import geomatry.GeomatryObject;
import geomatry.Rectangle;

public class TestAbstractClass {

    public static void main(String[] args) {

        GeomatryObject circle = new Circle(2);
        GeomatryObject rectangle = new Rectangle(2, 3);

        displayGeomatryObject(circle);
        displayGeomatryObject(rectangle);
    }

    public static void displayGeomatryObject(GeomatryObject object) {
        System.out.println("");
        System.out.println("The area is " + Math.round(object.getArea()));
        System.out.println("The perimeter is " + Math.round(object.getPerimeter()));
    }

}
