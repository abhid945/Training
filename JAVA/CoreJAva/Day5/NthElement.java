//Accept Nth index from user and display the nth largest element from that index

package Week_1.Day5;

import java.util.Arrays;
import java.util.Scanner;

public class NthElement {

    public  void findnth(){
        int[] array = {35,53,548,5,130};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth position upto" + array.length );
        int n = sc.nextInt();
        Arrays.sort(array);
        System.out.println("Nth largest is :" + array[5-n]);


    }


    public static void main(String[] args) {
        NthElement nthElement = new NthElement();
        nthElement.findnth();
    }
}





//Output

// Enter the nth position upto 5
//4
//8

