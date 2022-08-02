package Week_1.Day10;

/**
 What is constructor chaining
 @Athor Abhishek Dubey
 */


class Constructor{


    public Constructor() {
        this(5);
        System.out.println("This is a default Constructor");

    }

    public Constructor(int x) {

        this(10,20);
        System.out.println("The value of x is" + x);
    }

    public Constructor(int x, int y) {
    this(30,40,50);
        System.out.println("The value of x is " + x + " " + "The value of y is : "  + y);
    }

    public Constructor(int x, int y, int z) {
        System.out.println("The value of x is " + " " +  x + "The value of y is : " + " " + y   + "value of z is" +" " + z);
    }
}


public class ConstructorChaining {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();

    }
}


/*
Output

The value of x is  30The value of y is :  40value of z is 50
The value of x is 10 The value of y is : 20
The value of x is5
This is a default Constructor

 */