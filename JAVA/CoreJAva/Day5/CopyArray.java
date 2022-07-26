//Copy one array into another

package Week_1.Day5;

import java.util.Arrays;

public class CopyArray {

    public void copy(){
        int sourcearray[] = {2, 3, 12, 4, 12, -2};

        int destinationarray[] = new int[sourcearray.length];

        // copying data from source array to destination array
        System.arraycopy(sourcearray, 0, destinationarray, 0, sourcearray.length);
        System.out.println("Copy = " + Arrays.toString(destinationarray));
    }


    public static void main(String[] args) {
        CopyArray copyArray = new CopyArray();
        copyArray.copy();

    }
}
