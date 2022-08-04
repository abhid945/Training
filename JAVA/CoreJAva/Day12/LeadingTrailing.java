package Week_1.Day12;

/**
 * Remove both leading and trailing white space characters from the given string and
 * also showcase the Unicode value of the character present at index 5.
 */

class LeadTrail{

    void RemovingTrail(){
        String str = "     Hello     My     Name    is    Abhishek     Dubey      ";
        System.out.println( "Before trim: "+ str);
        System.out.println( "After trim: "+ str.trim());
    }

    void Codeat(){
        String str = "Hello my name is Abhishek";
        System.out.println("Unicode a t index 5 is => " + str.codePointAt(5));
    }
}

public class LeadingTrailing {
    public static void main(String[] args) {
  LeadTrail leadTrail = new LeadTrail();
  leadTrail.RemovingTrail();
  leadTrail.Codeat();
    }
}


/*
Output:
Before trim:      Hello     My     Name    is    Abhishek     Dubey
After trim: Hello     My     Name    is    Abhishek     Dubey
Unicode a t index 5 is => 32
 */