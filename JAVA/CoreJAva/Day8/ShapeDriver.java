package Week_1.Day8;
/**
 * CREATE A CLASS NAMED SHAPE, WHICH CONTAINS ONLY SINGLE
 * METHOD,calculateArea0. THIS METHOD SHOULD HAVE "N" NUMBER OF
 * PARAMETERS FOR DIFFERENT SHAPES LIKE FOR|
 * CIRCLE,RECTANGLE, TRIANGLE
 * @Author Abhishek Dubey
 */
class Shape
{
    void calculateArea(int... arg)
    {
        System.out.println("Printing Shape");
    }
}
class Circle extends Shape
{
    void calculateArea(int... arg)
    {
        System.out.println("Area of Circle "+Math.PI*(int)arg[0]);
    }

}
class Rectangle extends Shape{
    void calculateArea(int... arg)
    {
        System.out.println("Area of Rectangle "+(int)arg[0]*(int)arg[1]);
    }
}
class Triangle extends Shape
{
    void calculateArea(int... arg)
    {
        float a= ((int)arg[0] * (int)arg[1])*1/2;
        System.out.println("Area of Triangle "+a);
    }
}
public class ShapeDriver {
    public static void main(String[] args) {
        Shape s=null;
        s = new Circle();
        s.calculateArea(10);
        s = new Rectangle();
        s.calculateArea(10,20);
        s = new Triangle();
        s.calculateArea(10,10);
    }
}
