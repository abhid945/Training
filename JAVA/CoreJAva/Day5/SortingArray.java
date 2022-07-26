//Sorting Arrays in ascending and descending order

package Week_1.Day5;
import java.util.Arrays;
import java.util.Collections;

//Sort array in ascending and descending order in java using built in metthods

 class AscendingArray{
     int[] arr = {100,200,405,432,924724,928};

     public void originalArray(){
         System.out.println("Original Array:");
         for (int i= 0; i<arr.length;i++) {
             System.out.println( arr[i]);
         }
         System.out.println("**************************************");
     }


     public void Ascending(){
         Arrays.sort(arr);
         System.out.println("Sorted Array in Ascending order:");
         for (int i= 0; i<arr.length;i++) {
             System.out.println( arr[i]);
         }
         System.out.println("**************************************");
     }
 }

 class DescendingArray{
     Integer arr[] = {100,200,405,432,924724,928}; //Using INTEGER becausea collecion does not accept primitive dataype
     public void Descending(){
         Arrays.sort(arr, Collections.reverseOrder());
         System.out.println("Sorted Array in Descending order:");
         for (int i= 0; i<arr.length;i++) {
             System.out.println( arr[i]);
         }
 }

}

public class SortingArray{
    public static void main(String[] args) {
        AscendingArray ascendingArray = new AscendingArray();
        ascendingArray.originalArray();
        ascendingArray.Ascending();
        DescendingArray descendingArray =new DescendingArray();
        descendingArray.Descending();
    }

}




//OUTPUT:
//Original Array:
//        100
//        200
//        405
//        432
//        924724
//        928
//        **************************************
//        Sorted Array in Ascending order:
//        100
//        200
//        405
//        432
//        928
//        924724
//        **************************************
//        Sorted Array in Descending order:
//        924724
//        928
//        432
//        405
//        200
//        100
