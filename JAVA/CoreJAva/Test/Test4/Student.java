package Test4;

import java.util.Scanner;

public class Student extends StudentOptions {

    Scanner sc = new Scanner(System.in);

    void showMenu() {
        int option;
        System.out.println("Please enter 1 to Insert data" +
                "\nPlease enter 2 to Update data" +
                "\nPlease enter 3 to Remove data" +
                "\nPlease enter 4 to fetch data" +
                "\nPlease enter 5 to exit");
        option = sc.nextInt();
        int count = 0;
        StudentOptions Student[] = new StudentOptions[100];

            switch (option) {
                case 1:
                   Student[count++].insert();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    fetch();
                    break;
                case 5:
                    exit();
                    break;

            }
        }
    }






