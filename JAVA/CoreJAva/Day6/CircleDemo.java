package Week_1.Day6;
//Parent Class
class Shape{
    public void area(){
        System.out.println("This is a Shape Area method");
    }

}

//Child Class
class Circle extends Shape{

    public void area(){
        int radius = 10;
        float area;
        area = (float) (Math.PI * radius *radius);        //typecasting double into float
        System.out.println("Area of Circle is " + area);
    }
}

//Driver class
public class CircleDemo{
    public static void main(String[] args) {

        //Way 1 this  will just print shape method
//        Shape shape = new Shape(); //this is parent class object
//        shape.area();
//
//      //Creating child object with parent reference
//        Shape shape1 = new Circle();
//        shape1.area();
//
        //Way 3 Child object with Child reference
        Circle circle = new Circle();
        circle.area();
    }
}
