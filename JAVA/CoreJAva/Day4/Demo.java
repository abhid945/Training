package Week_1.Day4;

public class Demo {

         void m1(Demo demo) {
            System.out.println("Instance method");
        }
        static void m2(Demo d) {
            System.out.println("Static method");
        }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.m1(obj);
        Demo.m2(obj);
    }

}


//Here we are trying to override  the method, the paramaters given to the method is same
// JVM is giving this error because the user can call the static method using object too.
