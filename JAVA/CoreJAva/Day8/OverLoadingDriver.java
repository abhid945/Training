package Week_1.Day8;

/**
 * Practically prove, After changing the return type overloading happens or not
 * @Author Abhishek Dubey
 */

class OverloadingClass
{
    int Show() {
        System.out.println("Show Method with int return type and zero parameter");
        return 0;
    }
    float Show(int a) {
        System.out.println("Show method with float return type and one parameter "+a);
        return 0.0f;
    }
    void Show(float a,int b) {
        System.out.println("show Method with void return type and two parameter "+(a+b));
    }
}
public class OverLoadingDriver {
    public static void main(String[] args) {
        OverloadingClass o =new OverloadingClass();
        o.Show();
        o.Show(20);
        o.Show(13.0f,60);
    }
}



/*
Output:

 Show Method with int return type and zero parameter
 Show method with float return type and one parameter 20
 show Method with void return type and two parameter 73.0

 */