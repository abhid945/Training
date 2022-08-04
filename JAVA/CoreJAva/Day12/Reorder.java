package Week_1.Day12;
/**
 * Accept the strings(HARD CODE VALUES/USER ACCEPTED),as per their length and
 * reorder it.
 * @Author Abhishek Dubey
 */

import java.util.Arrays;
import java.util.Comparator;

class Sort{

    void sort(){
        String str[] = {"Abhishek","Anuj", "Aditya", "I", "Am","Lol" };

        Arrays.sort(str, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(str));
    }
}



public class Reorder {
    public static void main(String[] args) {
     Sort sort = new Sort();
     sort.sort();
    }
}


/*
Output:
[I, Am, Lol, Anuj, Aditya, Abhishek]
 */