package Week_1.Day14;

/**
 * Assertion
 */
public class AssertionExample {
    public static void main(String args[])
    {
        int value = 8;
        if (value <= 20) throw new AssertionError(" Overweight");
        System.out.println("value is " + value);
    }
}


/*
Output:
Exception in thread "main" java.lang.AssertionError:  Overweight
	at Week_1.Day14.AssertionExample.main(AssertionExample.java:7)

 */
