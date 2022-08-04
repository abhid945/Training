package Week_1.Day12;

/**
 * Convert String data into array and present it
 */
class Converting{

    void convert(){
        String str = "My name is Abhishek";

        String strArray[] = str.split(" ");

        System.out.println("String : " + str);
        System.out.println("String array :\n [ ");
        // Iterating over the string
        for (int i = 0; i < strArray.length; i++) {
            // Printing the elements of String array
            System.out.print(strArray[i] + ", ");
        }

        System.out.print("]");
    }
}

public class StringtoArray {
    public static void main(String[] args) {
 Converting converting = new Converting();
 converting.convert();
    }
}


/*
Output:
String : My name is Abhishek
String array :
 [
My, name, is, Abhishek, ]

 */