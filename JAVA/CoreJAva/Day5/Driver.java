//Area of Reactangle using Encapsulation

package Week_1.Day5;

class AreaofRectangle {
    private static double length;
    private static double width;
    private static double area;

    public static double getLength() {
        return length;
    }

    public static void setLength(double length) {
        AreaofRectangle.length = length;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        AreaofRectangle.width = width;
    }

    public static double getArea() {
        AreaofRectangle.area = length*width;
        return area;
    }

}

public  class Driver{

    public static void main(String[] args) {
        AreaofRectangle areaofRectangle = new AreaofRectangle();
        areaofRectangle.setLength(10);
        areaofRectangle.setWidth(20);

        System.out.println(areaofRectangle.getArea());
    }
}



//Output


// 200
