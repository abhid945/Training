package Week_1.Day12;

import java.util.Locale;

/**
 * Count the total number of vowels and consonants in a string
 */

class VandC{

    public void Counting(){
        String str = "AnfasiuhHSFbn";
        int vcount = 0, ccount = 0;

        str = str.toLowerCase();
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
          if(ch == 'a'|| ch == 'e'|| ch == 'i'||
                  ch =='o' || ch =='u'){
              vcount++;
          }
          else if ((ch >= 'a' && ch <= 'z'))
          {
           ccount++;
          }
        }
        System.out.println("Number of Vowels = " +vcount);
        System.out.println("Number of Consonant = " +ccount);
    }

}

public class VowelsandConsonant {
    public static void main(String[] args) {
VandC vandC = new VandC();
vandC.Counting();
    }
}


/*
Output
Number of Vowels = 4
Number of Consonant = 9
 */