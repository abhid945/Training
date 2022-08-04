package Week_1.Day12;

/**
 *Accept 5 names of string type, count the length.and as per their length assign there
 * order (Ascending).
 * =>Replace above strings "vowel characters" with their next letter.
 * =>Ex. "Aarti" => Vowels present here are = =>a(2),i(1)
 * =>next character of "a" is "b" and for "i" its "j"
 * ->so,final string will be "bbrti"
 */

import java.util.Locale;
import java.util.Scanner;

class Replace{

   void replacevowel(){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 5 Names : ");
       String str1= sc.nextLine();

      //Converting the string into UPPER CASE
      // String str1=str.toUpperCase();

      //Converting String 'str1' into character Array
       char[] ch = str1.toCharArray();

       for(int i=0 ;i<ch.length-1;i++)
       {
           // checking for 'vowel'
           if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'||
           ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
           {
               // if vowel found then increase 1 in the ASCII value of character
               // typecast into character and store in the same array position
               ch[i] = (char)(ch[i]+1);

           }
       }
       //Converting the array into String and store in str2
       String str2 = new String(ch);
       System.out.print(str2);
   }
}


public class ReplaceVowels {
    public static void main(String[] args) {
Replace replace = new Replace();
replace.replacevowel();
    }
}


/*
Output:

Enter 5 Names : Abhishek Raj Anuj Devayush Devansh
Bbhjshfk Rbj Bnvj Dfvbyvsh Dfvbnsh

 */
