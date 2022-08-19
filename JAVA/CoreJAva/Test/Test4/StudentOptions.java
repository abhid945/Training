package Test4;

import java.util.Scanner;

public class StudentOptions {
    Scanner scanner = new Scanner(System.in);
    int id;
    String firstName,lastName,city,techStack;
    long mobileNo;

    void insert(){
        System.out.println("Please enter your First name : ");
        firstName = scanner.next();
        System.out.println("Please enter your Last name : ");
        lastName = scanner.next();
        System.out.println("Please enter your City : ");
        city = scanner.next();
        System.out.println("Please enter your Tech Stack : ");
        techStack= scanner.next();
        System.out.println("Please enter your Mobile no : ");
        mobileNo = scanner.nextLong();
        System.out.println("Please enter your id : ");
    }


    void update(){
        System.out.println("Please enter your id: ");

    }

    void remove(){


    }

    void fetch(){
        System.out.println("**************Student Data**************");
        System.out.println("Name of the student is :" + firstName + lastName);
        System.out.println("Id of the student is :" + id);
        System.out.println("City of the student is :" + city);
        System.out.println("Tech Stack of the student is :" + techStack);
        System.out.println("Mobile no of the student is :" + mobileNo);
    }

    void exit(){
        System.out.println("Thank you for using the program");
    }


}
