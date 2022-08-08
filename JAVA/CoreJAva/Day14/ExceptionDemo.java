package Week_1.Day14;

class Exceptiontrial{

    public void division(){
        System.out.println("Line no one of diviide:");
        int a = 20,b = 0;
        float div = a/b;
        System.out.println(div);

        System.out.println("The next flow");

    }

    public  void show(){
    }
}

public class ExceptionDemo {
    public static void man(String[] args) {
        System.out.println("Line number 1 ");
        Exceptiontrial exceptiontrial = new Exceptiontrial();
        System.out.println("Line number 2");
        exceptiontrial.division();
        exceptiontrial.show();


    }
}
