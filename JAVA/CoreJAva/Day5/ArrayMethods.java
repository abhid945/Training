//Q.1 Array Methods

package Week_1.Day5;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String args[]) {

        Integer arr[] = {1, 2, 3, 4, 5, 6};

        //converting arrays into list
        Arrays.toString(arr);
        System.out.println("The Integer Array as a List = " + Arrays.asList(arr));

        //sorting of arrays
        Arrays.sort(arr);
        int arr_element = 5;//Binary search
        System.out.println(arr_element + " is found at index = " + Arrays.binarySearch(arr, arr_element));
        Arrays.sort(arr);
        int ele = 6;
        System.out.println(ele + " is found at index = " + Arrays.binarySearch(arr, 1, 3, ele));


        // this is to showcase compareUnsigned() method
        int m[] = {10, 11, 12, 13, 14};
        int n[] = {20, 30, 40, 50, 60};

        //copy method copies the mentioned array
        System.out.println("Integer Array is: "  + Arrays.toString(Arrays.copyOf(arr, 10)));


    }
}






//Output :-


//        The Integer Array as a List = [1, 2, 3, 4, 5, 6]
//        5 is found at index = 4
//        6 is found at index = -4
//        Integer Array is: [1, 2, 3, 4, 5, 6, null, null, null, null]