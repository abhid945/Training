package Week_1.Day10;
/**
4.Accessing paramaterised method
 */


import java.lang.reflect.Method;

class Numbers{

    public void displayNumber(int a){
        System.out.println("The value of a is " + a);
    }
}


public class ParamaterisedMethod {
    public static void main(String[] args)throws Exception {
        Numbers numbers = new Numbers();
        Class aClass = Class.forName("Week_1.Day10.Numbers");
      //  Object diplayobject = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("displayNumber",new Class[]{int.class});
        method.invoke(numbers,1000);
        System.out.println(method);
    }

}


/*
Output 

The value of a is 1000
public void Week_1.Day10.Numbers.displayNumber(int)
 */