package Week_1.Day2;

public class Types_of_variable {

    //instance variable
    int pan_number;
    String name;
    //static value
    public void add(){
        //local variable: we have to initialise local variable.
        int number1 = 10,number2 = 20,  sum = 0;   //initialisation: declaration with value.
        sum = number1 +  number2;
        System.out.println("Sum of int is:" +sum);
        System.out.println("Name is:="+name);
        System.out.println("Pan number is" +pan_number);
    }
    public static void main(String[] args) {
        //class_name reference_name = new class_name();
        //new : will help in creating DYNAMIC  memory
        Types_of_variable typesOfVariable = new Types_of_variable();
        //using object we cannot initialize the value of local variables.
        System.out.println("*******************************************");
        typesOfVariable.pan_number = 0123456;
        typesOfVariable.name = "Abhishek";
        typesOfVariable.add();
    }
}
