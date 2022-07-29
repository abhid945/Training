//Test 1

//ARRAY OF SIZE 5 AND ITTERATE IT
//Find the greatest element
//print the greatest among the array

import java.util.Arrays;

class Test{
   int arr[] = {2,15,1,100,70};

   public void printarray(){
       for (int i = 0;i<arr.length;i++){
           System.out.println(arr[i]);

       }
       System.out.println("************************************");
   }


   public void GreatestNumber(){
       Arrays.sort(arr);
       System.out.println("The largest element is :" + arr[arr.length-1]);
   }

   public void SecondLargest(){
       System.out.println("The second largest element is:" + arr[arr.length-2]);
   }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.printarray();
        test.GreatestNumber();
        test.SecondLargest();
    }
}
