package Week_1.Day10;

/**
 2.Use of class for checkc method constructor fields
 3.Try to access private field of class
 */


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class TestingReflection{

    private String name;
    public  int a = 123;

    public TestingReflection() {

        name = "Abhishek";
    }

    public TestingReflection(String name){
        this.name = name;
    }


    public void Displayname(){

        System.out.println("The name is :" + name);
    }

    public void Displaysurname(String surname) throws  InternalError{

        System.out.println("The surname is :" + surname);
    }

    private void Output(){
        System.out.println("Private method invoked");
    }
}



public class ReflectionExample {
    public static void main(String[] args)throws Exception {
       Class c = Class.forName("Week_1.Day10.TestingReflection");
        System.out.println("*****************Constructors***************");
        Constructor[] constructors = c.getConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }

        System.out.println("*******************Fields******************");
        Field[] fields = c.getFields();
        for (Field field: fields){
            System.out.println(field);
        }

        System.out.println("***********Private Field**************888");
        Field field = c.getDeclaredField("name");    //Accessing private fields of class
        field.setAccessible(true);
        System.out.println(field);

        System.out.println("****************Methods**************88");
        Method[] methods = c.getMethods();
        for (Method method: methods){
            System.out.println(method);
        }
        System.out.println("**************Private Methods**********");
        Method method = c.getDeclaredMethod("Output");
        method.setAccessible(true);
        System.out.println(method);
    }
}


/*
Output

*****************Constructors***************
public Week_1.Day10.TestingReflection()
public Week_1.Day10.TestingReflection(java.lang.String)
*******************Fields******************
public int Week_1.Day10.TestingReflection.a
***********Private Field**************888
private java.lang.String Week_1.Day10.TestingReflection.name
****************Methods**************88
public void Week_1.Day10.TestingReflection.Displaysurname(java.lang.String) throws java.lang.InternalError
public void Week_1.Day10.TestingReflection.Displayname()
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public boolean java.lang.Object.equals(java.lang.Object)
public java.lang.String java.lang.Object.toString()
public native int java.lang.Object.hashCode()
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()
**************Private Methods**********
private void Week_1.Day10.TestingReflection.Output()
 */