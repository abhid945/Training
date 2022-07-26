//Removing duplicate elements


package Week_1.Day5;

import java.util.Arrays;

public class DuplicateElements {
    Integer array[] = {1,3,5,6,3,2,3,4,5};

    public void Duplicate(){


        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if( (array[i].equals(array[j])) )
                {
                    System.out.println("Duplicate Element is : "+array[j]);
                }
            }
        }
        System.out.println("**********Removing Duplicates************");
    }


     public void RemovingDuplicate(){
         Arrays.sort(array);
         int len = array.length;
         int j = 0;

         for (int i = 0; i < len - 1; i++){
             //if value present at i and i+1 index is not equal
             if (array[i] != array[i + 1]) {
                 array[j++] = array[i];
             }
         }

         array[j++] = array[len - 1];
         for (int k = 0; k < j; k++) {
             System.out.print(array[k] + " ");
         }
     }


    public static void main(String[] args) {
     DuplicateElements duplicateElements = new DuplicateElements();
     duplicateElements.Duplicate();
     duplicateElements.RemovingDuplicate();
    }
}




// OUTPUT:-

//  Duplicate Element is : 3
//  Duplicate Element is : 3
//  Duplicate Element is : 5
//  Duplicate Element is : 3
//**********Removing Duplicates************
//  1 2 3 4 5 6