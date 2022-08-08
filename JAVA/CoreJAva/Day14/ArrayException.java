package Week_1.Day14;

/**
 * public class ABC
 * public static void main(String[] args) {
 * int] array = new int[1o]; int sum = 0;
 * // good code
 * for (inti =0; i< array.length; i++){
 * sum sum + array[i];
 * Try it for conditions =>1)i< 10
 * =>2)i<11
 * @Author Abhishek Dubey
 */
public class ArrayException {
    public static void main(String[] args) {
        int array[] = new int[10];
        int sum = 0;
        try {
            for (int i = 0; i < 11; i++) {
                sum = sum + array[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index Out of bound");
        }
    }
}



/*
Output:

Index Out of bound
 */