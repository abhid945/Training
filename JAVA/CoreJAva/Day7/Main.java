package Week_1.Day7;


import java.util.logging.Level;

abstract class Shapee{

    abstract void area();
}

class Circlee extends  Shapee{
    @Override
    public void area() {
        int radius =10;
        System.out.println("Area of Circle is :" + Math.PI * radius * radius);
    }
}


class Square extends  Shapee{


    @Override
    void area() {
       int Side =10;
        System.out.println("Area of Square is :" + Side*Side);
    }
}

class Cylinder extends  Circlee {

    @Override
    public void area() {
        int radius = 12, height = 15;
       // super.area();
        System.out.println("Area  of Cylinder is :" + 2 * Math.PI * radius *height);
    }

}
class Rectanglee extends Square{
    @Override
    void area() {
        int length = 20,breadth = 10;
        //super.area();
        System.out.println("Area of Rectangle is : " + length*breadth);
    }
}

class  TestShape {
    public void test() {
        Shapee[] shape = new Shapee[4];
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    shape[i] = new Circlee();
                    break;
                case 1:
                    shape[i] = new Cylinder();
                    break;
                case 2:
                    shape[i] = new Square();
                    break;
                case 3:
                    shape[i] = new Rectanglee();
                    break;
            }
        }

        for (int i = 0; i < 4; i++) {
            shape[i].area();
        }
    }
}

public class Main {

    public static void main(String[] args) {
         TestShape testShape = new TestShape();
         testShape.test();
    }

}
