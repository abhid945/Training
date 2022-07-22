package Week_1.Day2;

public class Operators {

    public void arithmetic(){
        // declare variables
        int number1 = 12, number2 = 5;

        System.out.println("Arithmetic Operators");

        // addition operator
        System.out.println("number1 + number2 = " + (number1 + number2));

        // subtraction operator
        System.out.println("number1 - number2 = " + (number1 - number2));

        // multiplication operator
        System.out.println("number1 * number2 = " + (number1 * number2));

        // division operator
        System.out.println("number1 / number2 = " + (number1 / number2));

        // modulo operator
        System.out.println("number1 % number2 = " + (number1 % number2));

        System.out.println("******************************************");
    }

    public void assignment(){
        // create variables
        int num = 5;
        int var;

        System.out.println("Assignment operators");

        // assign value using =
        var = num;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += num;                 //var = num + var;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= num;     //    var = num * var
        System.out.println("var using *=: " + var);
        System.out.println("******************************************");
    }

    public void relational(){
        int a = 15, b = 11;  //keeping variables as a and b because its easire to compare a and b


        System.out.println("Relational Operators");
        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println("a = b:-" + (a == b));  // false

        // != operator
        System.out.println("a != b:- "+(a != b));  // true

        // > operator
        System.out.println("a > b:-"+(a > b));  // false

        // < operator
        System.out.println("a < b" + (a < b));  // true

        // >= operator
        System.out.println("a >= b" + (a >= b));  // false

        // <= operator
        System.out.println("a <= b" + (a <= b));  // true
        System.out.println("******************************************");
    }

     public void logical(){

         System.out.println("Logical Operators");
         // && operator
         System.out.println((5 > 3) && (8 > 5));  // true
         System.out.println((5 > 3) && (8 < 5));  // false

         // || operator
         System.out.println((5 < 3) || (8 > 5));  // true
         System.out.println((5 > 3) || (8 < 5));  // true
         System.out.println((5 < 3) || (8 < 5));  // false

         // ! operator
         System.out.println(!(5 == 3));  // true
         System.out.println(!(5 > 3));  // false
         System.out.println("******************************************");
     }

    public void IncDec(){

        int a = 12, b = 12;
        int increment, decrement;

        System.out.println("This is Increment and Decrement Operators");
        // original value
        System.out.println("Value of a: " + a);

        // increment operator
        increment = ++a;
        System.out.println("After increment: " + increment);

        System.out.println("Value of b: " + b);

        // decrement operator
        decrement = --b;
        System.out.println("After decrement: " + decrement);
        System.out.println("******************************************");
    }

    public void Ternary(){
        int februaryDays = 29;
        String result;

        System.out.println("This is Ternary operator:");
        System.out.println("No of days in February:" + februaryDays );
        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.arithmetic();
        operators.assignment();
        operators.relational();
        operators.logical();
        operators.IncDec();
        operators.Ternary();


    }




}
