package Week_1.Day12;

public class StringLiteralNew {
    public static void main(String[] args) {
        String e = "Abhishek";
        String f =  new String("Abhishek").intern();
        System.out.println(e == f);
    }


}
