package Week_1.Day8;
/**
Write a program for Addition operation,
Class Addition{
/add method overioading for addo
Class Varargs_Addition
/use varargs for add method
Class MainApplication{
//access above classes in mainO
 @Author Abhishek Dubey
 */

class Addition{
    public void add(int a, int b){
        System.out.println("Addition of a and b is : " + (a+b));
    }
    public void add(int a , int b, int c){
        System.out.println("Addition of a and b is : " + (a+b+c));
    }
}

class Var_ArgsAddition {
    public void add(int... a) {
        int result;
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum of " + a.length + " numbers is :" + sum);
    }
}

public class MainApplication {

    public void show(){
      Var_ArgsAddition var_argsAddition = new Var_ArgsAddition();
      var_argsAddition.add(10,20,30);
    }
    public static void main(String[] args) {
     MainApplication mainApplication = new MainApplication();
     mainApplication.show();
     Addition addition = new Addition();
     addition.add(10,40);
     addition.add(15,20,40);
    }
}


/*  Output
Sum of 3 numbers is :60
Addition of a and b is : 50
Addition of a and b is : 75

 */