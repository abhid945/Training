package Week_1.Day3;

import java.util.Scanner;

public class Greatest {
    int numberOne, numberTwo, greatest_num;
    public void Print_Greatest(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        numberOne = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        numberTwo = scan.nextInt();

        if(numberOne>numberTwo)
            greatest_num = numberOne;
        else
            greatest_num= numberTwo;

        System.out.println("Greatest number is = " +greatest_num);
    }




    public static void main(String[] args) {
        Greatest greatest = new Greatest();
        greatest.Print_Greatest();

    }
}


//OUTPUT

//   Enter the First Number: 10
//   Enter the Second Number: 20
//   Greatest number is = 20
