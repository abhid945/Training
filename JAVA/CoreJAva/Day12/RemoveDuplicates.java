package Week_1.Day12;

/**
 *  Remove all repeated characters from a given string.
 */

class Duplicates{

    void removingDuplicates(){
        StringBuilder s=new StringBuilder("Abhishekabhi");
        for(int i=0;i<s.length();i++){
            String a=s.substring(i,i+1);
            while(s.indexOf(a)!=s.lastIndexOf(a))
            {
                s.deleteCharAt(s.lastIndexOf(a));
            }
        }
        System.out.println(s.toString());
    }
}




public class RemoveDuplicates {
    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        duplicates.removingDuplicates();
    }
}


/*
Output
Abhiseka
 */