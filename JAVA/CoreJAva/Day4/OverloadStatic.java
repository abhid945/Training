// Can we Overload the static method?

//  YES , I have given the example below


package Week_1.Day4;

public class OverloadStatic {

    public static void  method1() {
        System.out.println("OverloadStatic.method1() called ");
    }
    public static void method1(int a) {
        System.out.println("OverloadStatic.method1(int a) called");
    }
    public static void main(String args[])
    {
        OverloadStatic.method1();
        OverloadStatic.method1();
    }
}


//We can overload the static method.

