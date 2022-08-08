package Week_1.Day14;

public class ExceptionStringtoInt {
    public static void main(String[] args) {
        try{
            int  a = Integer.parseInt("abcdef");
            System.out.println(a);
        }
        catch (NumberFormatException numberFormatException){
            System.out.println( numberFormatException.getMessage());
        }
    }
}
